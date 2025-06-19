# exercice3_istouv

This project showcases a simplified drawing application using the visitor pattern and a small reporting system using the decorator pattern.

## Painting Example

The `Painting` class can build a hierarchy of different elements (islands, lakes, boats, etc.) from a description file located in `src/Data/elements.txt`. Various visitors allow counting elements, printing them and computing their total area.

Run `Main` and choose the **Art** menu to experiment with these visitors.

## Reporting Example

The reporting subsystem demonstrates a factory and decorator pattern. You can create incident, movement, contact or routine reports and enhance them with decorators (urgent tag, classified, commander tag, audio attachment). Run `Main` and choose the **Reports** menu to see it in action.

## Building

This repository contains only simple source files and does not rely on external dependencies. Compile and run using `javac` and `java` or import the project into your favorite IDE.

