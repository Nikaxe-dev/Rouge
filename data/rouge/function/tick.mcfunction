# Check any deaths

execute as @a[scores={deaths_event=1..},tag=!respawned] run function rouge:respawn/check

execute as @a run execute if score @s rouge_help matches 1 run function rouge:triggers/help