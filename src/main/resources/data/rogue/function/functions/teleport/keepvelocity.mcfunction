# Teleports the entity while keeping velocity
# WARNING: DOES NOT WORK
# ALSO PROBABLY VERY EXPENSIVE AND UNEEDED FOR SOMETHING THIS SMALL
# WHY DID I WASTE MY TIME SO MUCH LOL

# Store current position
execute store result score @s rogue_tempX run data get entity @s Pos[0] 1.0
execute store result score @s rogue_tempY run data get entity @s Pos[1] 1.0
execute store result score @s rogue_tempZ run data get entity @s Pos[2] 1.0

# Store target position
$scoreboard players set #x rogue_operation $(x)
$scoreboard players set #y rogue_operation $(y)
$scoreboard players set #z rogue_operation $(z)

# Compute data
scoreboard players operation #x rogue_operation -= @s rogue_tempX
scoreboard players operation #y rogue_operation -= @s rogue_tempY
scoreboard players operation #z rogue_operation -= @s rogue_tempZ

# Send data to rogue:temp storage
execute store result storage rogue:temp x int 1.0 run scoreboard players get #x rogue_operation
execute store result storage rogue:temp y int 1.0 run scoreboard players get #y rogue_operation
execute store result storage rogue:temp z int 1.0 run scoreboard players get #z rogue_operation

# Teleport relative with computed data
function rogue:functions/teleport/relative with storage rogue:temp