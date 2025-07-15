scoreboard players enable @s rouge_help
scoreboard players set @s rouge_help 0

tellraw @s ["",{"text":"List of "},{"text":"Rouge","color":"red"},{"text":" trigger","color":"green"},{"text":" functions:\n\n* /"},{"text":"trigger","color":"aqua"},{"text":" rouge_help","color":"red"},{"text":" -- Shows a list of commands and guides.","color":"gray"}]