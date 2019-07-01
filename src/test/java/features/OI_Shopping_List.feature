This feature file describes the behaviour of the OI Shopping List application

Feature − Scenario Outline

ScenarioOutline: User is a able to create list items and delete them as desired

The user is able to create list and delete shopping list items

Given I launch the OI shopping List app
When I create a new <list>
And add new list <items>
And delete an <item> from the <list>
Then new list should be created and deleted item should not be displayed in list items

Examples:
| list         | items     | 
| Electronics  | Fan	   | 
|              | TV        |
|              | Speaker   | 
|              | Radio	   | 
|              | Sugar     |
|              | Milk      |
|              | Sugar     |
|              | Egg       |


Feature: Verifying sorting feature of list items

This feature file describes the behaviour of the OI Shopping List application sorting feature

ScenarioOutline: User is able to sort list items alphabetically

The user is able to create list items and sort in a specific order

Given I launch the OI shopping List app
And I create a new <list>
And add new list <items>
When I sort the created list items alphabetically
Then list items should be be displayed in alphabetic order

Examples:
|   list       | items     | 
|   Office     | Chair	   | 
|              | Books     |
|              | Laptop    |
|              | Desk      |