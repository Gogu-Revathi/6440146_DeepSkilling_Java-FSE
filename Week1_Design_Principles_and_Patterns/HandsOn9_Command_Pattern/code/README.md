# Command Pattern – Interactive Home Automation System

## Scenario
A remote control system that turns a light ON or OFF using command objects. The system uses the Command Pattern to decouple the command issuer from the command executor.

## Design Pattern Used
Command Pattern – encapsulates a request as an object, allowing the parameterization of clients with different requests.

## Project Structure
- `Command.java`: Command interface
- `Light.java`: Receiver class
- `LightOnCommand.java`, `LightOffCommand.java`: Concrete commands
- `RemoteControl.java`: Invoker class
- `CommandPatternDemo.java`: Interactive demo

## Sample Output
```
Enter command (on/off): on
Light is turned ON.
```

## How to Run
```
javac *.java
java CommandPatternDemo
```

## Key Features
- Clean separation of command, receiver, and invoker
- Easily extendable to other devices
- Interactive command selection
