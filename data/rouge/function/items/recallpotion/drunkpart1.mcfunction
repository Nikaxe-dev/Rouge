execute as @a[tag=server_host] in rouge:camp run playsound minecraft:item.ominous_bottle.dispose block @a ~ ~ ~ 4 1 1
execute as @a[tag=server_host] in minecraft:overworld run playsound minecraft:item.ominous_bottle.dispose block @a ~ ~ ~ 4 1 1

schedule function rouge:items/recallpotion/drunkpart2 3.75s