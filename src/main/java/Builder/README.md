## Builderパターンメモ

* インスタンス作成をメソッドチェーンで行う。

<br>

* インスタンス作成においてコンストラクタに多量の引数を取る必要があったり、
動的に引数の数が変化する場合などに効果的である。

<br>

* 引数の数が多くなると引数にとる値が何を示すかが一見して分かりにくくなったりするが、
メソッドチェーンで設定していく方式なので視認性も良い。

<br>

* 欠点として、純粋にコーディング量が多くなる。  
業務で使う場合、ある程度工数がかかることを覚悟できないと
使用は難しい印象。