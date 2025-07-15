execute store result storage minecraft:run_coordinates x int 1.0 run random value -30000..30000
data modify storage minecraft:run_coordinates y set value 300
execute store result storage minecraft:run_coordinates z int 1.0 run random value -30000..30000

effect give @a[tag=server_host] resistance 15 255 true

execute as @a[tag=server_host] in minecraft:overworld run function rouge:teleport with storage minecraft:run_coordinates