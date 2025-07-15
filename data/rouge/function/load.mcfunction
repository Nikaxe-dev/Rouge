# Give first player the server_host tag
tag @a[limit=1] add server_host

# Create run position scoreboard
scoreboard objectives add run_position_x dummy
scoreboard objectives add run_position_z dummy

scoreboard players set @a[tag=server_host] run_position_x 0
scoreboard players set @a[tag=server_host] run_position_z 0

# Detect first time playing and load the world

scoreboard objectives add times_loaded dummy

execute unless score @a[tag=server_host,limit=1] times_loaded matches 1.. as @a[tag=server_host,limit=1] run function rouge:loadworld/start

scoreboard players add @a[tag=server_host] times_loaded 1

# Set pack gamerules

gamerule keepInventory true
gamerule doImmediateRespawn true

# Create death event scoreboard

scoreboard objectives add deaths_event deathCount

# Create triggers for use without cheats

scoreboard objectives add rouge_help trigger
scoreboard players enable @a rouge_help
scoreboard players set @a rouge_help 0

tellraw @a ["",{"text":"Rouge","color":"dark_aqua"},{"text":" Datapack by "},{"text":"Nikaxe","color":"red"},{"text":" loaded."}]
tellraw @a ["",{"text": "---------------"}]