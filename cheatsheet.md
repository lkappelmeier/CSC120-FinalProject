This file will contain documentation for all commands available in your game.

Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.


# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.

# smithFinal

quit
- ends game
- prints points earned during game

coordinates
- prints curret player coordinates

where am i
- prints the name of the current location

move (north, south, east, west)
- checks if it is a valid move
- adjusts coordinates and locations if valid
- resets if invalid
- prints current location
- also checks for chests and people

open chest
- prints items in chest
- automatically adds to inventory
- prints that there are no items if there is no chest or if it has already been opened

interact
- interacts with person if they are at location
- adjusts points and prints
- does not work if no person is there

drop (item)
- checks for item in inventory
- prints that it has been dropped
- removes item from inventory
- does not work if item is not found in inventory

use (item)
- checks for item in inventory
- prints that it has been used
- adjusts points if applicable
- does not work if item is not found in inventory

inventory
- prints all items in inventory
- does not work if no items in inventory

points
- prints all points



The game takes place at smith college. The ways to win are:
- get to the PVTA
- earn enough points in one of the categories (charisma, logic, fitness, creativity) or total points
- points are earned by interacting with people or using objects from chests
- you need to have enough specific category points to go into Sage, McConnell, or Scott Gym. 
- if you fall in the pond, you lose