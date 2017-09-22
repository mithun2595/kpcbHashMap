Using only primitive types in Java I have created a HashMap that can hash any generic data object against a string key. This is implemented as a single class file.
The custom HashMap implemented tries to resemble any built-in HashMap, but to just brief on the functions provided by my HashMap, I enlist the following:
1. constructor(size): return an instance of the class with pre-allocated space for the given number of objects.
2. boolean set(key, value): stores the given key/value pair in the hash map. Returns a boolean value indicating success / failure of the operation.
3. get(key): return the value associated with the given key, or null if no value is set.
4. delete(key): delete the value associated with the given key, returning the value on success or null if the key has no value.
5. float load(): return a float value representing the load factor (`(items in hash map)/(size of hash map)`) of the data structure. Since the size of the dat structure is fixed, this should never be greater than 1.

