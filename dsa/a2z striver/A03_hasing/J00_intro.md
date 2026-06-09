# Intro of hashing in dsa

__Hashing__ in Data Structures and Algorithms (DSA) is a technique that __efficiently stores and retrieves data__ by mapping keys to specific indices in a hash table using a mathematical formula called a __hash function__.  This allows for average __O(1) time complexity__ for search, insert, and delete operations, making it significantly faster than arrays or linked lists for large datasets. 

__Key components and concepts include:__

__Hash Function:__ A deterministic algorithm that converts input data (keys) into a fixed-size integer (hash code), which determines the storage index. 
__Collision:__ Occurs when two different keys produce the same hash index. Common resolution techniques include __Separate Chaining__ (using linked lists at each index) and __Open Addressing__ (using probing methods like Linear, Quadratic, or Double Hashing).
__Load Factor:__ The ratio of stored entries to total buckets; high load factors increase collision probability, often triggering __rehashing__ (resizing the table). 
__Applications:__ Widely used for implementing __Hash Sets__ (unique elements) and __Hash Maps__ (key-value pairs), as well as in database indexing, caching, and cryptography. 