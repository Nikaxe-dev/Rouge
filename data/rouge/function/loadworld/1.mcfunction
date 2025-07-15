execute in rouge:camp run setblock -20 80 -20 structure_block{mode:"LOAD",name:"rouge:starting_island",powered:1b}
execute in rouge:camp run setblock -22 80 -20 redstone_block
execute in rouge:camp run setblock -23 80 -20 sticky_piston[facing=east]

execute in rouge:camp run setblock -24 80 -20 redstone_block

schedule function rouge:loadworld/2 .2s