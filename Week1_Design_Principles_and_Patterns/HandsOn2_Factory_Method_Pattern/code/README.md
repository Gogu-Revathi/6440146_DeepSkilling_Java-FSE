# Factory Method Pattern – Document Management (Interactive)

## Scenario
A document management system creates different types of documents (Word, PDF, Excel) using the Factory Method Pattern. Each document type is created through a dedicated factory class.

## Design Pattern Used
Factory Method Pattern – delegates object creation to factory subclasses based on document type.

## Project Structure
- `Document.java` – Interface for all document types
- `WordDocument.java`, `PdfDocument.java`, `ExcelDocument.java` – Concrete document classes
- `DocumentFactory.java` – Abstract factory class
- `WordFactory.java`, `PdfFactory.java`, `ExcelFactory.java` – Concrete factories
- `FactoryPatternDemo.java` – Interactive test class

## Sample Output
```
Select document type to create (Word / PDF / Excel): 
PDF
Opening PDF Document.
```

## How to Run
Compile and run:
```
javac *.java
java FactoryPatternDemo
```

## Key Features
- Fully interactive selection
- Implements Factory Method Pattern accurately
- Separates object creation logic from client logic
