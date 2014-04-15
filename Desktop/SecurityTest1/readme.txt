<ReadMe>
このプロジェクトはWebページで使われる Hidden という方法でデータの
やり取りにおける危険性を端的に示すプログラムである。
http://www.ipa.go.jp/security/awareness/vendor/programmingv1/a01_05.html
ここを見てほぼ作ったんだけどね。サーブレットの復習も兼ねていい勉強になりました。

本来
login.html(password入力) → menuサーブレット →　expressサーブレット → MemberOnlyサーブレット
とたどることでしか、会員のみが閲覧できるページを表示することができない。
（今回は作りが甘いため素のままでサーブレットが呼び出せてしまうがそこは置いておこう）
本来はExpress.javaで
memberflg = 1 かつnewsid = 1 が選択されたときに、memberonlyサーブレットが
expressサーブレットによって呼び出される。
このmemberflg = 1 はlogin.htmlから入力された文字をmenuサーブレットが判断して、
Hiddenに埋め込んでいる。
しかし、test-security.htmlは絶対パスを記入することと、memberflgにあらかじめ
値を入れておくことで、expressサーブレットからmemberonlyサーブレットを呼び出している。