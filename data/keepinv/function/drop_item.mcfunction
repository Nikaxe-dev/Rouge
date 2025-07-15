$summon item ~ ~.9 ~ {Item:$(item)}

data remove storage keepinv:storage inventory[0]
data modify storage keepinv:storage drop.item set from storage keepinv:storage inventory[0]

execute if data storage keepinv:storage inventory[0] run return run function keepinv:drop_item with storage keepinv:storage drop