package edu.fudan.nlp.resources;
public class CharSets {
	private static String punctuation =  
		"、。·ˉˇ¨〃々—～‖…‘’“”〔〕〈〉《》「」『』〖〗【】±＋－×"+
		"÷∧∨∑∏∪∩∈√⊥‖∠⌒⊙∫∮≡≌≈∽∝≠≮≯≤≥∞∶∵∴∷♂♀°′"+
		"〃℃＄¤￠￡‰§№☆★〇○●◎◇◆回□■△▽⊿▲▼◣◤◢◥▁▂▃▄▅"+
		"▆▇█▉▊▋▌▍▎▏▓※→←↑↓↖↗↘↙〓ⅰⅱⅲⅳⅴⅵⅶⅷⅸⅹ①②③④"+
		"⑤⑥⑦⑧⑨⑩⒈⒉⒊⒋⒌⒍⒎⒏⒐⒑⒒⒓⒔⒕⒖⒗⒘⒙⒚⒛⑴⑵⑶⑷⑸⑹⑺⑻"+
		"⑼⑽⑾⑿⒀⒁⒂⒃⒄⒅⒆⒇ⅠⅡⅢⅣⅤⅥⅦⅧⅨⅩⅪⅫ！"+
		"”ㄅㄆㄇㄈㄉㄊㄋㄌㄍㄎㄏㄐㄑ"+
		"ㄒㄓㄔㄕㄖㄗㄘㄙㄚㄛㄜㄝㄞㄟㄠㄡㄢㄣㄤㄥㄦㄧㄨㄩ︴﹏﹋﹌—━│┃"+
		"┄┅┆┇┈┉┊┋┌┍┎┏┐┑┒┓└┕┖┗┘┙┚┛├┝┞┟┠┡┢┣┤┥┦"+
		"┧┨┩┪┫┬┭┮┯┰┱┲┳┴┵┶┷┸┹┺┻┼┽┾┿╀╁╂╃╄╅╆╇╈╉"+
		"╊╋⊕㊣㈱曱甴囍∟┅﹊﹍╭╮╰╯_^（：！\t\b\r\"<>`,:~～"+
		"卐℡ぁ＂″ミ灬№＊ㄨ≮≯＋－／∝≌∽≤≥≈＜＞じ"+
		"ぷ┗┛￥￡§я-―¨…‰′〃℅℉№℡∕∝∣═║╒╓╔╕╖╗╘╙╚╛╜╝"+
		"╞╟╠╡╢╣╤╥╦╧╨╩╪╫╬╱╲╳▔▕〆〒〡〢〣〤〥〦〧〨〩㎎㎏㎜"+
		"㎝㎞㎡㏄㏎㏑㏒㏕兀∶﹍﹎"+
		"▄【┻┳═\\/%&';=@#!˙";
	public static String RegexPunc="\\-\\(\\)\\{\\}\\[\\]\\s\\.\\*\\+\\^\\$\\\\\\?\\|";
	public static String allRegexPunc = "["+punctuation+RegexPunc+"]+";
	public static String japanese = "ぁあぃいぅうぇえぉおかがき"+
		"ぎくぐけげこごさざしじすずせぜそぞただちぢっつづてでとどなにぬねのはば"+
		"ぱひびぴふぶぷへべぺほぼぽまみむめもゃやゅゆょよらりるれろゎわゐゑをん"+
		"ァアィイゥウェエォオカガキギクグケゲコゴサザシジスズセゼソゾタダチヂッ"+
		"ツヅテデトドナニヌネノハバパヒビピフブプヘベペホボポマミムメモャヤュユ"+
		"ョヨラリルレロヮワヰヱヲンヴヵヶ";
	public static String unkown = "ΑΒΓΔΕΖΗΘΙΚ∧ΜΝΞΟ∏Ρ∑Τ"+
	"ΥΦΧΨΩαβγδεζηθικλμνξοπρστυφχψω"+
	"АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦ"+
	"ЧШЩЪЫЬЭЮЯабвгдеёжзийклмнопрстуфхцчш"+
	"щъыьэюāáǎàēéěèīíǐìōóǒòūúǔùǖǘǚǜüêɑńňɡ";
	public static String fullShape = "＃￥％＆’（）＊＋，－．／０１２３４５６７８９：；＜＝＞？＠ＡＢＣＤ"+
		"ＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ＼＾＿‘ａｂｃｄｅｆｇ"+
		"ｈｉｊｋｌｍｎｏｐｑｒｓｔｕｖｗｘｙｚ｛｜｝［］";
	public static String chineseNum = "一二三四五六七八九十";
}