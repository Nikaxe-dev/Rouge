advancement revoke @s only keepinv:has_died

# Clear items with the vanishing curse

clear @s *[minecraft:enchantments~[{enchantments: "minecraft:vanishing_curse"}]]

# Lose xp

experience set @s 0 points
execute store result storage keepinv:storage drop.exp int 0.3 run experience query @s levels

function keepinv:subtract_exp with storage keepinv:storage drop.exp

# Store and clear items

function keepinv:store_inv
function keepinv:clear_inv

# Store drop data

data modify storage keepinv:storage drop.UUID set from entity @s UUID
data modify storage keepinv:storage drop.item set from storage keepinv:storage inventory[0]

# Drop all items

execute if data storage keepinv:storage inventory[0] run return run function keepinv:drop_item with storage keepinv:storage drop