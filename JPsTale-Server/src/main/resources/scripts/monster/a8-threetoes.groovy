monster = [
	ID:'a8-threetoes',
	Name:'远古树妖',
	Clazz:0,// 1 BOSS
	Brood:0x91,// 0 Normal; 0x90(144) UNDEAD; 0x91 MUTANT; 0x92 DEMON; 0x93 MECHANIC;
	// Common Status
	Level:112,
	ActiveHour:0,
	RespawnGroup:[1, 1],

	Attributes:[
		Life:15000,
		// Attack Status
		Atk:[503, 523],
		AtkSpeed:9,
		Range:80,
		Rating:1800,

		// Defence Status
		Flee:1000,
		Absorb:20,
		Block:10,
		DamageStunPers:15,

		// Resistance
		Earth:0,
		Fire:20,
		Ice:100,// Water
		Lighting:80,// Wind
		Poison:60,
	],

	// AI
	AI:[
		Nature:0x82,// 0x80 NATURAL; 0x81 GOOD; 0x82 EVIL
		IQ:8,
		Real_Sight:380,
		Talks:[],

		// Move Behavier
		Move_Speed:6,
		MoveRange:64,

		// Skill Behavier
		SpAttackPercetage:15,
		SkillDamage:[535, 557],
		SkillDistance:50,
		SkillRange:60,
		SkillRating:18,
		SkillCurse:0,

		// Heal Behavier
		PotionPercent:0,
		PotionCount:0,
	],

	Looks:[
		ClassCode:0,
		ArrowPosi:[0, 0],
		ModelSize:0.0,
		UseEventModel:false,
		SizeLevel:1,
		Model:'char/monster/MonSeto/seto.ini',
		Sound:0x000018D0,
	],

	// Drops
	AllSeeItem:false,
	Exp:48000,
	Quantity:1,
	drops:[
		[probability:5050, code:"NULL"/* Drops nothing */],
		[probability:3100, code:"GG101", value:[12000, 16800]/* Gold */],
		[probability:1500, code:"PM104"/* 顶级恢复魔法药水 */],
		[probability:18, code:"WA111"/* 天阙斧 */],
		[probability:18, code:"WC114"/* 天狼爪 */],
		[probability:18, code:"WM113"/* 魔蜓杖 */],
		[probability:18, code:"WP114"/* 龙翼枪 */],
		[probability:18, code:"WS115"/* 精灵之翼 */],
		[probability:18, code:"WS217"/* 鬼切 */],
		[probability:18, code:"WT114"/* 追月标 */],
		[probability:18, code:"DA122"/* 炫金圣铠 */],
		[probability:18, code:"DA222"/* 雅典娜圣衣 */],
		[probability:18, code:"DS116"/* 远古之盾 */],
		[probability:18, code:"OM114"/* 堕天 */],
		[probability:1, code:"WA114"/* 战神之刃 */],
		[probability:1, code:"WC115"/* 魔玉爪 */],
		[probability:1, code:"WM115"/* 亡灵刺 */],
		[probability:1, code:"WP116"/* 虹月 */],
		[probability:1, code:"WS116"/* 血精灵 */],
		[probability:1, code:"WS219"/* 凝雾 */],
		[probability:1, code:"WT116"/* 玛雅神标 */],
		[probability:1, code:"DA123"/* 凤凰圣铠 */],
		[probability:1, code:"DA223"/* 凤凰圣衣 */],
		[probability:1, code:"DS118"/* 死神之盾 */],
		[probability:1, code:"OM111"/* 淬火乌晶 */],
		[probability:5, code:"OR205"/* 火神指环 */],
		[probability:5, code:"OR103"/* 金戒指 */],
		[probability:5, code:"OA130"/* 凯尔维苏项链 */],
		[probability:5, code:"OA114"/* 神之庇护 */],
		[probability:5, code:"OS113"/* 恶魔石 */],
		[probability:5, code:"OS112"/* 圣晶石 */],
		[probability:5, code:"OS111"/* 龙睛石 */],
		[probability:5, code:"OS110"/* 钻晶石 */],
		[probability:5, code:"OS109"/* 龙鳞石 */],
		[probability:20, code:"EC103"/* 回城卷 */],
		[probability:20, code:"DB113"/* 遁地靴 */],
		[probability:20, code:"DG117"/* 炫钻护手 */],
		[probability:20, code:"OA217"/* 炫钻臂环 */]
	],
	drops_more:[
	]
]
