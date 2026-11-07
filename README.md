# Assignment 6 - Visitor Pattern

**Student:** Ismail Bolat  
**Group:** SE-2512  
**Student ID:** 252357  
**Course:** Software Design Patterns

## Project description

This project demonstrates the Visitor behavioral design pattern in a space mission management system.

The object structure contains three types of space assets:
- `Satellite`
- `Rover`
- `SpaceProbe`

Different operations are performed without putting those operations inside the element classes.

## Pattern components

- **Element:** `SpaceAsset` declares `accept(Visitor visitor)`.
- **Concrete Elements:** `Satellite`, `Rover`, and `SpaceProbe`.
- **Visitor:** `Visitor` declares `visitSatellite`, `visitRover`, and `visitSpaceProbe`.
- **Concrete Visitors:** `MassReportVisitor`, `PowerConsumptionVisitor`, and `MissionSummaryVisitor`.
- **Object Structure:** the `List<SpaceAsset>` in `Main`.

## Operations

1. `MassReportVisitor` prints the mass of each asset and calculates total mass.
2. `PowerConsumptionVisitor` prints power consumption and calculates the total.
3. `MissionSummaryVisitor` prints the inventory and counts all assets.

## How to run

Open the project in IntelliJ IDEA.

The main class is:

`src/spacemission/Main.java`

Run `Main`.

You can also compile and run from the project folder using a terminal:

```bash
javac -d out src/spacemission/*.java
java -cp out spacemission.Main
```

## Clean Code principles

1. **Meaningful names:** names such as `MassReportVisitor` and `Satellite` clearly show each class responsibility.
2. **Single Responsibility:** each visitor performs one operation across all asset types.
3. **No type-checking chains:** there are no `instanceof` chains. The correct visit method is selected through double dispatch.
4. **Encapsulation:** fields are private and final. Visitors access the required information through getters.
5. **Open for new operations:** a new concrete visitor can be added without changing the existing element classes.
6. **Clear interfaces:** `SpaceAsset` and `Visitor` define the communication expected by the pattern.

## Double dispatch

The client calls `asset.accept(visitor)`. The concrete element's `accept` method then calls its matching visitor method and passes itself using `this`.

For example, `Satellite.accept(visitor)` calls `visitor.visitSatellite(this)`. This selects the operation based on both the concrete element type and the concrete visitor implementation.

## Technologies

- Java
- IntelliJ IDEA
- Git
- GitHub
