# Design Patterns Examples in Java

Welcome to the Design Patterns Learning Repository! 👋 This repository is designed to help you understand software design patterns in a simple and practical way.

## What's Inside? 📚

This repository contains examples of common design patterns organized into three main categories:

1. **Creational Patterns** - Patterns about object creation
   - [Factory Pattern](src/Creational/Factory) - Creates objects without exposing creation logic
   - [Singleton Pattern](src/Creational/Singleton) - Ensures a class has only one instance
   - [Builder Pattern](src/Creational/Builder) - Builds complex objects step by step
   - (More coming soon!)

2. **Structural Patterns** - Patterns about object relationships
   - [Proxy Pattern](src/Structural/Proxy) - Controls access to objects
   - (More coming soon!)

3. **Behavioral Patterns** - Patterns about object communication
   - [State Pattern](src/Behavioral/State) - Allows an object to alter its behavior when its internal state changes
   - (More coming soon!)

## Getting Started 🚀

### Prerequisites 🛠️

- Java Development Kit (JDK) installed on your computer
- Visual Studio Code (recommended) or your preferred IDE
- [Markdown Preview Mermaid Support](https://marketplace.visualstudio.com/items?itemName=bierner.markdown-mermaid) extension for VS Code to view the design diagrams

### Repository Structure 📂

Each design pattern is organized as follows:

```
pattern-name/
├── README.md           # Pattern explanation and diagrams
├── *Main.java         # Example usage
└── Implementation files
```

### How to Use This Repository 📖

1. **Choose a Pattern**: 
   - Start with simpler patterns like Singleton or Factory
   - Each pattern folder contains everything you need to understand it

2. **Study the Pattern**:
   - Read the README.md first
   - Understand the problem it solves
   - Look at the diagrams
   - Review the code implementation
   - Run the example

3. **Run the Examples**:
   ```bash
   # From the root directory:
   javac src/pattern-category/pattern-name/*.java
   java src/pattern-category/pattern-name/PatternNameMain
   ```

## Pattern Documentation Structure 📑

Each pattern's README includes:

1. **Problem Description** 🤔
   - Clear explanation of the problem the pattern solves
   - Why traditional approaches aren't ideal
   - Common challenges it addresses

2. **Real-World Example** 🌍
   - Simple, everyday analogy everyone can understand
   - Makes the pattern relatable to real-life situations
   - Helps visualize the pattern's purpose

3. **Use Case** 💡
   - Specific scenarios where the pattern is useful
   - When to use the pattern
   - When not to use it

4. **Key Characteristics** ✨
   - Main features and principles
   - Benefits and potential drawbacks
   - Design considerations

5. **Class Diagram** 📊
   - Mermaid diagram showing relationships
   - Clear visualization of pattern structure
   - Component interactions

6. **Step-by-Step Code Explanation** 📝
   - Detailed breakdown of each component
   - Implementation examples with comments
   - Key points for each class/interface
   - Common variations and alternatives

7. **Usage Examples** 💻
   - Complete working code samples
   - Expected output
   - Common usage scenarios

8. **Best Practices** ⭐
   - Implementation guidelines
   - Common pitfalls to avoid
   - Tips for effective usage

This comprehensive documentation ensures that each pattern is:
- Easy to understand for beginners
- Practical with real-world examples
- Well-documented with clear explanations
- Supported by working code examples

## Currently Implemented Patterns 🎯

### Creational
- ✅ Factory Pattern - Creating objects without specifying exact class
- ✅ Singleton Pattern - Single instance across application

### Structural
- ✅ Proxy Pattern - Controlling access to objects

### Behavioral
- ✅ State Pattern - Managing object state transitions

## Need Help? ❓

- Each example uses simple, real-world scenarios
- Code is thoroughly commented
- READMEs include detailed explanations
- Start with the basics and progress gradually

## Contributing 🤝

Feel free to:
- Suggest improvements
- Add new patterns
- Fix bugs
- Improve documentation

Happy Learning! 🎉
