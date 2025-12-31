# Runs every tick

# Set WorldSpawn to [rogue:camp]: (0, 0, 0) with the respawn_radius set to 0
execute in rogue:camp run setworldspawn 0 0 0
gamerule respawn_radius 0

# Detect new players and if there is one run rogue:events/newplayer as them
execute as @a[tag=!playerinit] run function rogue:events/newplayer/main
tag @a[tag=!playerinit] add playerinit

# Check for world init
function rogue:events/loadworld/checkconditions
# Add worldinit tag to stop the world from generating a second time
execute in rogue:camp if block 0 -1 0 bedrock run tag @a add worldinit

# Detect players falling off the map and start a run
execute as @a at @s if entity @s[y=-64, dy=-100, tag=!rundebounce] if score @s rogue_run_start_debounce matches ..0 run function rogue:functions/startrun/main

# Debounce scoreboards
scoreboard players operation @a rogue_run_start_debounce -= #int_1 rogue_operation