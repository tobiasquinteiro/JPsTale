monster = [
	ID:'82_strider',
	Name:'双刀娜迦',
	Clazz:0,// 1 BOSS
	Brood:0x92,// 0 Normal; 0x90(144) UNDEAD; 0x91 MUTANT; 0x92 DEMON; 0x93 MECHANIC;
	// Common Status
	Level:82,
	ActiveHour:0,
	RespawnGroup:[1, 1],

	Attributes:[
		Life:2300,
		// Attack Status
		Atk:[45, 55],
		AtkSpeed:9,
		Range:80,
		Rating:1300,

		// Defence Status
		Flee:720,
		Absorb:14,
		Block:8,
		DamageStunPers:50,

		// Resistance
		Earth:40,
		Fire:40,
		Ice:40,// Water
		Lighting:30,// Wind
		Poison:60,
	],

	// AI
	AI:[
		Nature:0x82,// 0x80 NATURAL; 0x81 GOOD; 0x82 EVIL
		IQ:9,
		Real_Sight:350,
		Talks:[],

		// Move Behavier
		Move_Speed:5,
		MoveRange:64,

		// Skill Behavier
		SpAttackPercetage:0,
		SkillDamage:[50, 60],
		SkillDistance:0,
		SkillRange:0,
		SkillRating:17,
		SkillCurse:0,

		// Heal Behavier
		PotionPercent:0,
		PotionCount:0,
	],

	Looks:[
		ClassCode:0,
		ArrowPosi:[0, 25],
		ModelSize:1.2,
		UseEventModel:false,
		SizeLevel:-1,
		Model:'char/monster/strider/strider.ini',
		Sound:0x00001750,
	],

	// Drops
	AllSeeItem:false,
	Exp:32000,
	Quantity:1,
	drops:[
		[probability:1350, code:"NULL"/* Drops nothing */],
		[probability:2740, code:"PM103"/* 高级恢复魔法药水 */],
		[probability:2740, code:"PM104"/* 顶级恢复魔法药水 */],
		[probability:105, code:"DA109"/* 黄铜战铠 */],
		[probability:105, code:"DA209"/* 学徒披风 */],
		[probability:105, code:"WA108"/* 叼刚 清磐 */],
		[probability:105, code:"WC109"/* 兽之斧刃 */],
		[probability:105, code:"WH109"/* 固萍绢扼捞飘 */],
		[probability:105, code:"WM109"/* 绊胶飘 */],
		[probability:105, code:"WP109"/* 单喉 荤捞靛 */],
		[probability:105, code:"WS110"/* 固胶飘 */],
		[probability:105, code:"WS210"/* 敲饭萍逞 家靛 */],
		[probability:105, code:"WT109"/* 酒唱能促 */],
		[probability:105, code:"DB108"/* 百战靴 */],
		[probability:105, code:"DS108"/* 赤龙焰盾 */],
		[probability:105, code:"OM109"/* 暗月 */],
		[probability:105, code:"DG108"/* 大地护手 */],
		[probability:105, code:"OA208"/* 百炼臂环 */],
		[probability:105, code:"OR112"/* 王者戒指 */],
		[probability:105, code:"OA112"/* 魔龙之心 */],
		[probability:42, code:"DA110"/* 百裂铠 */],
		[probability:42, code:"DA210"/* 信徒披风 */],
		[probability:42, code:"WA109"/* 破山斧 */],
		[probability:42, code:"WC109"/* 兽之斧刃 */],
		[probability:42, code:"WH110"/* 轩辕巨锤 */],
		[probability:42, code:"WM110"/* 圣者杖 */],
		[probability:42, code:"WP110"/* 白银之枪 */],
		[probability:42, code:"WS111"/* 龙骨战弓 */],
		[probability:42, code:"WS211"/* 斩马刀 */],
		[probability:42, code:"WT110"/* 飞云标 */],
		[probability:42, code:"DB109"/* 大地靴 */],
		[probability:42, code:"DS109"/* 圣盾 */],
		[probability:42, code:"OM110"/* 蓝色星辰 */],
		[probability:42, code:"DG109"/* 神力护手 */],
		[probability:42, code:"OA209"/* 飞翼臂环 */],
		[probability:42, code:"EC102"/* 回城卷 */],
		[probability:42, code:"OR113"/* 灵魂之戒 */],
		[probability:42, code:"OA113"/* 生命之链 */],
		[probability:42, code:"EC105"/* 公会卷轴 */],
		[probability:16, code:"DA111"/* 重装机铠 */],
		[probability:16, code:"DA211"/* 大法师袍 */],
		[probability:16, code:"WA110"/* 定神斧 */],
		[probability:16, code:"WC110"/* 九头刺蛇爪 */],
		[probability:16, code:"WH111"/* 赤冥之锤 */],
		[probability:16, code:"WM111"/* 王者杖 */],
		[probability:16, code:"WP111"/* 屠龙枪 */],
		[probability:16, code:"WS112"/* 人马之辉 */],
		[probability:16, code:"WS212"/* 嗜血屠魔剑 */],
		[probability:16, code:"WT111"/* 神标 */],
		[probability:16, code:"DB110"/* 地火战靴 */],
		[probability:16, code:"DS110"/* 宙斯盾 */],
		[probability:16, code:"OM111"/* 淬火乌晶 */],
		[probability:16, code:"DG110"/* 火云护手 */],
		[probability:16, code:"OA210"/* 百川流水臂环 */],
		[probability:16, code:"EC102"/* 回城卷 */],
		[probability:16, code:"OR113"/* 灵魂之戒 */],
		[probability:16, code:"OA113"/* 生命之链 */],
		[probability:16, code:"OS106"/* 玄风石 */],
		[probability:16, code:"OS107"/* 水晶石 */],
		[probability:16, code:"EC105"/* 公会卷轴 */],
		[probability:7, code:"DA112"/* 战神宝铠 */],
		[probability:7, code:"DA212"/* 红莲战袍 */],
		[probability:7, code:"WA111"/* 天阙斧 */],
		[probability:7, code:"WC111"/* 利维坦 */],
		[probability:7, code:"WH112"/* 碎星锤 */],
		[probability:7, code:"WM112"/* 审判之杖 */],
		[probability:7, code:"WP112"/* 傲天枪 */],
		[probability:7, code:"WS113"/* 猛犸巨弩 */],
		[probability:7, code:"WS213"/* 双截刃 */],
		[probability:7, code:"WT112"/* 鸩尾标 */],
		[probability:7, code:"DB111"/* 圣靴 */],
		[probability:7, code:"DS111"/* 苍穹之盾 */],
		[probability:7, code:"OM112"/* 菱晶石 */],
		[probability:7, code:"DG111"/* 黄铜护手 */],
		[probability:7, code:"OA211"/* 玄铁臂环 */],
		[probability:7, code:"OR114"/* 帝王之戒 */],
		[probability:7, code:"OA114"/* 神之庇护 */],
		[probability:7, code:"OS107"/* 水晶石 */],
		[probability:7, code:"GP109"/* 神秘水晶 */],
		[probability:7, code:"GP112"/* 鬼影魔神水晶 */],
		[probability:3, code:"DA113"/* 虎刹魔铠 */],
		[probability:3, code:"DA213"/* 幽绿之眼 */],
		[probability:3, code:"WA112"/* 奥丁斧 */],
		[probability:3, code:"WC112"/* 飞龙爪 */],
		[probability:3, code:"WH113"/* 破日锤 */],
		[probability:3, code:"WM113"/* 魔蜓杖 */],
		[probability:3, code:"WP113"/* 冥河战镰 */],
		[probability:3, code:"WS214"/* 金刚伏魔剑 */],
		[probability:3, code:"WS214"/* 金刚伏魔剑 */],
		[probability:3, code:"WT113"/* 魔龙标 */],
		[probability:3, code:"DB112"/* 破棘之靴 */],
		[probability:3, code:"DS112"/* 暗黑盾 */],
		[probability:3, code:"OM113"/* 西法路 */],
		[probability:3, code:"DG112"/* 巨灵护手 */],
		[probability:3, code:"OA212"/* 紫焰臂环 */],
		[probability:3, code:"OR115"/* 守护之戒 */],
		[probability:3, code:"OA115"/* 暗印护符 */],
		[probability:3, code:"OS107"/* 水晶石 */],
		[probability:3, code:"OS108"/* 虎翼石 */],
		[probability:3, code:"GP109"/* 神秘水晶 */],
		[probability:3, code:"GP110"/* 守护圣徒水晶 */]
	],
	drops_more:[
		[probability:200, code:"DA113"/* 虎刹魔铠 */]	]
]
