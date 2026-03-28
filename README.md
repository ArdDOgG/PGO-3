 you# PGO-3
# Cafe Order System

A simple Java console application simulating a cafe order handling system.

## What it does

The application allows you to create menu items, register customers, build orders and calculate totals. It demonstrates core Object-Oriented Programming concepts such as encapsulation, method overriding and object comparison.

## Classes

- **MenuItem** – represents a single product available in the cafe
- **CafeCustomer** – represents a customer placing an order
- **Order** – represents a customer's order containing a list of menu items
- **Main** – entry point demonstrating the full workflow

## Key features

- Automatic order numbering using a static field
- Product counter tracking how many items have been created
- Custom equals() logic comparing customers by ID or email, and products by code
- Readable object summaries via overridden toString() methods