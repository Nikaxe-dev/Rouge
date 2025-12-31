# Runs upon the world loading

# Add operation scoreboard, which is used when calculating.
scoreboard objectives add rogue_operation dummy
scoreboard players set #int_1 rogue_operation 1

# Run start debounce scoreboard
scoreboard objectives add rogue_run_start_debounce dummy

# Temp scoreboards

scoreboard objectives add rogue_tempX dummy
scoreboard objectives add rogue_tempY dummy
scoreboard objectives add rogue_tempZ dummy