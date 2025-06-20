# Proxy Pattern – Interactive Image Viewer with Caching

## Scenario
This application simulates an image viewer that loads images from a remote server. Using the Proxy Pattern, it performs lazy initialization and caches previously loaded images.

## Design Pattern Used
Proxy Pattern – controls access to the real image, adds caching and deferred loading.

## Project Structure
- `Image.java`: Interface
- `RealImage.java`: Loads and displays image
- `ProxyImage.java`: Handles lazy loading and caching
- `ProxyPatternDemo.java`: Interactive test class

## Sample Output
```
Enter image filename to view (or type 'exit'): photo1.png
Loading image from server: photo1.png
Displaying: photo1.png

Enter image filename to view (or type 'exit'): photo1.png
Displaying: photo1.png
```

## How to Run
```
javac *.java
java ProxyPatternDemo
```

## Key Features
- Lazy loading of images
- Cache mechanism prevents duplicate loads
- Simple and efficient user experience
