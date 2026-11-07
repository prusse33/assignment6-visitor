# Assignment 6 - Defense Notes

## 1. What problem does Visitor solve?

Visitor lets us add new operations to a stable group of object types without placing every operation inside those element classes.

In this project, the stable elements are satellites, rovers, and space probes. We can apply different reports to them.

## 2. What are the Elements?

`SpaceAsset` is the Element interface. `Satellite`, `Rover`, and `SpaceProbe` are Concrete Elements.

Each concrete element implements `accept(Visitor visitor)`.

## 3. What are the Visitors?

`Visitor` declares one visit method for every concrete element type. The concrete visitors implement those methods:
- `MassReportVisitor`
- `PowerConsumptionVisitor`
- `MissionSummaryVisitor`

Each visitor represents one separate operation.

## 4. What is double dispatch?

First, the client calls `accept` on an element. Then the concrete element calls the matching `visitX` method on the visitor.

For example:
`Satellite.accept(visitor)` calls `visitor.visitSatellite(this)`.

This is why the correct visitor method is selected without an `instanceof` chain.

## 5. Why do we use getters?

The element fields are private. Getters allow visitors to read the data they need without making fields public.

## 6. What happens if we add a new visitor?

We can create another class that implements `Visitor`. Existing element classes do not need to change. The new visitor must implement all three visit methods.

## 7. What happens if we add a new element type?

We must add a new `visitNewElement` method to `Visitor` and implement it in every concrete visitor. This is a trade-off of the Visitor pattern.

## 8. Common defense questions

**Q: Is Visitor a creational, structural, or behavioral pattern?**  
A: It is a behavioral design pattern.

**Q: Why is `accept` needed?**  
A: It starts the double-dispatch process.

**Q: Why does `accept` pass `this`?**  
A: It passes the current concrete element to the matching visitor method.

**Q: Why not put mass calculation inside every element?**  
A: Visitor keeps the operation separate from the element classes and makes it easier to add other operations.

**Q: Does this project use `instanceof`?**  
A: No. The concrete element's `accept` method selects the matching visit method.

**Q: What is the object structure?**  
A: The `List<SpaceAsset>` in `Main`, which the client traverses and passes to visitors.
