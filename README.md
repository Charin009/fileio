File Input and Output
=====================
by Charin Tantrakul
-------------------
I ran the tasks on my MacBook Pro, and got these results:

|Task                                                     | Time           |
|:--------------------------------------------------------|---------------:|
|Copy a file byte-by-byte                                 |4.868201168 seconds|
|Copy a file using byte of size 1KB                       |0.011187818 seconds|
|Copy a file using byte of size 4KB                       |0.004114722 seconds|
|Copy a file using byte of size 64KB                      |0.001615857 seconds|
|Copy a file using BufferedReader and PrintWriter         |0.065056947 seconds|

Explanation of Results
--------
Why copy file byte by byte are slowest?


Because Copy-file-byte-by-byte task copy file 1 byte at a time
but in other CopyTask copy file 0.14KB,1KB,4KB or 64KB at a time(KB=kilobyte)


Copy By using BufferedReader Task copy file 1 line or 0.14KB at a time that is a reason why this task slower than Copy by using byte of size 1KB,4KB or 64KB  
