# This code loads the world when it is first opened

# Replace block below where players spawn to make sure they dont fall
execute in rogue:camp run setblock 0 -1 0 bedrock

# Generate the starting island centered at (0, 0, 0)
# IMPORTANT: Make sure to edit the postition so it is centered when editing the islands size.
# IMPORTANT: Make sure the block (0, -1, 0) ends up as bedrock so the world being loaded for the first time can be detected properly.
execute in rogue:camp run place template rogue:starting_island -11 -11 -11