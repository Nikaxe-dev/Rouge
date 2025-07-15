advancement revoke @s only rouge:recall_potion_drank_event

particle dust_plume ~ ~ ~ .25 .25 .25 1 10000
particle portal ~ ~ ~ 1 1 1 1 10000

playsound block.portal.trigger block @a[tag=server_host] 100000 150 10000 1000 1 .15

schedule function rouge:items/recallpotion/drunkpart1 .15s