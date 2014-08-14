Android 增量更新
======

##1. 介绍

类似Google I/O 上提及的 Smart App update，应用增量更新机制

##2. 原理
What is a patch?

>  A patch is a small text document containing a delta of changes between two
different versions of a source tree. Patches are created with the `diff'
program.

利用了Linux上的Patch打补丁的方法，将旧项目和新项目进行差别对比(使用bsdiff或者Courgette工具)生成patch文件，然后使用bspatch将旧项目与Patch进行合并

##3. 参考文档
[http://blog.csdn.net/hmg25/article/details/8100896](http://blog.csdn.net/hmg25/article/details/8100896 "浅析android应用增量升级")

[http://www.csee.usf.edu/~nsamteladze/projects/delta.html](http://www.csee.usf.edu/~nsamteladze/projects/delta.html "Nikolai Samteladze's Blog")