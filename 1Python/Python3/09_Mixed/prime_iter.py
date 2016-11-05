#from http://forums.xkcd.com/viewtopic.php?f=11&t=88300
from itertools import count
def prime_iter():
    yield 2
    candidates = count(3,2)
    for candidate in candidates:
        if candidate%2 == 0: continue
        n = 3
        while n*n <= candidate:
            if candidate%n == 0:
                break
            n += 2
        else:
            yield candidate

# memoization decorator
def memoize(f):
   cache = {}
   def memoized(*x, **k):
      if x in cache:
         return cache[x]
      else:
         result = f(*x, **k)
         cache[x] = result
         return result
   return memoized

@memoize
def factorize_rec(n):
   "Recursive factorization function, suitable for memoization"
   if n==1:
      return {}
        for p in prime_iter():
      if p*p > n:
         return {n:1}
      if n%p == 0:
         return add_counts({p:1}, factorize_rec(n/p))

def sigma_fn(n): 
    "sigma function: returns sum of divisors"
    fzn = factorize_rec(n)
    return product((sum((p**j for j in xrange(i+1))) for p,i in fzn.items()))
def s(n):
    "s function: returns aliquot sum (sum of proper divisors)"
    return sigma_fn(n) - n
