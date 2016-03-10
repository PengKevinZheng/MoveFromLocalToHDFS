# MoveFromLocalToHDFS

    只有TXT格式的文件才能被选中，将多个txt文件移动到HDFS。代码的核心部分在于1.过滤文件  2. copy多个文件。以下是用到的API：
    
    1.Interface PathFilter：  
    
       boolean	accept(Path path)
    
       Tests whether or not the specified abstract pathname should be included in a pathname list.   
    
    
    2.org.apache.hadoop.fs.FileSystem
    
        An abstract base class for a fairly generic filesystem. It may be implemented as a distributed filesystem, or as a "local" one that reflects the locally-connected disk. The local version exists for small Hadoop instances and for testing.   
        
        get(Configuration conf)
        Returns the configured filesystem implementation.    
        
        get(URI uri, Configuration conf)
        Returns the FileSystem for this URI's scheme and authority.   
        
        
        globStatus(Path pathPattern)
        Return all the files that match filePattern and are not checksum files.    
        
        
        globStatus(Path pathPattern, PathFilter filter)
        Return an array of FileStatus objects whose path names match pathPattern and is accepted by the user-supplied path filter.  
        
    3. org.apache.hadoop.fs.FileStatus  
    
        Interface that represents the client side information for a file.   
        
    4. org.apache.hadoop.fs.FileUtil  
    
        A collection of file-processing util methods   
        
          stat2Paths(FileStatus[] stats):   convert an array of FileStatus to an array of Path
    
    
