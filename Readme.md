# Java I/O Overview

## Input/Output Basics
| Type         | Description                                         |
|--------------|-----------------------------------------------------|
| DISK         | Reading/writing files on disk                        |
| NETWORK      | Handling HTTP, databases                             |
| API          | Servlet, REST, Web services                          |
| Memory       | Accessing "off heap" memory                          |

## Object Creation in JVM
- Objects created in a memory zone called heap
- Unused memory managed by garbage collector
- Off-heap extends Java app memory capabilities

## Evolution Timeline
- 1995: Java I/O
- Java 1 to Java 4 (off heap)
- 2011: Java NIO2 in Java 7

## Java I/O Disk
- Portability: `File` class (Java 1), `Path` interface (Java 7+)
- Represents file system paths
- Path objects don't access disk directly

## File Operations
- Methods like `getName()`, `getParent()`, `getPath()`
- `getCanonicalPath()` accesses FS, may throw IOException

## File Testing Methods
- Checking file existence, type, permissions
- Methods like `isFile()`, `isDirectory()`, `canRead()`, etc.

## Java I/O Organization
- Abstract classes define output medium (File, Socket, Buffer)

## Reader/Writer Hierarchy
| Category   | Text                       | Binary                   |
|------------|----------------------------|--------------------------|
| **Read**   | Reader                     | InputStream              |
| **Write**  | Writer                     | OutputStream             |

## Handling Reader/FileReader
- Bug with file leaking (v1)
- Improved pattern with try-catch-finally (v2)
- Java 7's try-with-resources for automatic closure

## Decorator Pattern
- BufferedReader extends abstract class Reader
- Additional methods like `readLine()`, `lines()`

## Managing Multiple Resources
- How try-with-resources handles multiple resource closures

## Summary
- Reader reads character arrays or individual characters from input streams
- Extensions like FileReader, StringReader, CharArrayReader, BufferedReader serve specific reading purposes

## Conclusion
- `Reader` is an abstract class allowing reading character arrays from input streams or characters one by one.
- **First extensions**:
    - `FileReader`: Opens read streams on files
    - `StringReader`: Opens read streams directly on strings (objects in memory)
    - `CharArrayReader`: Opens character streams on character arrays (also in memory)
    - `BufferedReader`: A decorator that can be built on instances of FileReader, StringReader, CharArrayReader
        - **Extension**:
            - `LineNumberReader`: Internally counts lines read in the BufferedReader
