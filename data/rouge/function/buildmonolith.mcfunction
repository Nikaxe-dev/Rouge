# Function to build the monolith (used to send someone on a trip)

execute unless block 150000 254 149996 lodestone run setblock 150000 254 149996 lodestone
execute unless block 150000 254 149997 stone_button run setblock 150000 254 149997 stone_button[facing=south]

execute unless block 150000 253 149996 command_block run setblock 150000 253 149996 command_block{Command:"function rouge:startrun"}

execute unless block 149999 253 149996 stone_bricks run setblock 149999 253 149996 stone_bricks
execute unless block 150000 253 149997 stone_brick_stairs run setblock 150000 253 149997 stone_brick_stairs[facing=north]
execute unless block 150001 253 149996 stone_bricks run setblock 150001 253 149996 stone_bricks
execute unless block 150000 253 149995 stone_bricks run setblock 150000 253 149995 stone_bricks
execute unless block 149999 253 149997 stone_bricks run setblock 149999 253 149997 stone_bricks
execute unless block 150001 253 149997 stone_bricks run setblock 150001 253 149997 stone_bricks
execute unless block 149999 253 149995 stone_bricks run setblock 149999 253 149995 stone_bricks
execute unless block 150001 253 149995 stone_bricks run setblock 150001 253 149995 stone_bricks