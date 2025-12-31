# This function starts a run for the player its currently running as.

scoreboard players set @s rogue_run_start_debounce 30

# Store random coordinates for teleport function to use
execute store result storage rogue:temp x int 1.0 run random value -30000..30000
data modify storage rogue:temp y set value 500
execute store result storage rogue:temp z int 1.0 run random value -30000..30000

# Give heavy resistance so the player doesnt die on the ground impact
effect give @s resistance 10 255 true

# time set $(time query day)d
# time add 1000
execute store result storage rogue:temp time int 1.0 run time query day
function rogue:functions/time/setday with storage rogue:temp
time add 1000

# Teleport the player
execute as @s in minecraft:overworld run function rogue:functions/teleport/keepvelocity with storage rogue:temp