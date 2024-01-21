# Cow Management System

This repository contains Java code developed as part of an Operating Systems course. The program simulates the behavior of cows in different compounds, such as eating, drinking, and walking, while managing shared resources using semaphores.

## Table of Contents

- [Introduction](#introduction)
- [Compounds](#compounds)
- [CowThread](#cowthread)
- [DrinkingCompounds](#drinkingcompounds)
- [EatingCompounds](#eatingcompounds)
- [WalkingCompounds](#walkingcompounds)
- [Runner](#runner)
- [Semaphore](#semaphore)
- [SharedResources](#sharedresources)

## Introduction

The project is designed to showcase synchronization and resource management concepts in the context of multi-threaded programming. The main components of the system include `Compounds`, `CowThread`, `DrinkingCompounds`, `EatingCompounds`, `WalkingCompounds`, `Runner`, `Semaphore`, and `SharedResources`.

## Compounds

The `Compounds` class represents the main control unit for managing eating, drinking, and walking compounds. It utilizes instances of `EatingCompounds`, `DrinkingCompounds`, and `WalkingCompounds` to handle the corresponding activities for a group of cows.

## CowThread

The `CowThread` class extends `Thread` and represents an individual cow. Each cow is assigned a unique identifier and is responsible for executing a sequence of actions, including eating, drinking, and walking. The interactions with shared resources are managed through the `SharedResources` and `Compounds` instances.

## DrinkingCompounds

The `DrinkingCompounds` class manages the drinking compound, ensuring that cows do not exceed the maximum capacity and avoiding conflicts with eating activities.

## EatingCompounds

The `EatingCompounds` class manages the eating compound, enforcing a maximum capacity and handling the start and end of eating activities for cows.

## WalkingCompounds

The `WalkingCompounds` class maintains a list of cows currently engaged in walking activities, allowing for the addition and removal of cows from the list.

## Runner

The `Runner` class serves as the entry point for the program. It takes user input for the number of cows and the capacities of hay and trough compounds, initializes the necessary objects, and starts the cow threads.

## Semaphore

The `Semaphore` class is a basic implementation of a semaphore used for managing access to shared resources. It provides methods for acquiring and releasing tickets.

## SharedResources

The `SharedResources` class encapsulates semaphores and shared variables used for coordination among cow threads.

## Usage

To run the program, compile and execute the `Runner` class. Follow the prompts to input the number of cows and capacities for hay and trough compounds.

```bash
javac Runner.java
java Runner
```

## Contributors

- [Abo Rabia Rami](#)
- [Stav Zysblatt](#)

Feel free to explore, modify, and extend the code for educational purposes or to experiment with multi-threading concepts in Java. If you have any questions or suggestions, please contact the contributors.
