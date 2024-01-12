package baseball;;

public class BaseBallTeam {

    //フィールド
    private String name;    //チーム名
    private int win;        //勝ち数
    private int lose;       //負け数
    private int draw;       //引分

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win  = win;
        this.lose = lose;
        this.draw = draw;
    }


    // reportメソッド
    public void report() {
        double rate = getRate(); 
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + rate + "です。");

    }

    // 勝率メソッド
    public double getRate() {
        //自チームの勝ち数と負け数から求める
        double rate = (double)win/(win + lose);
        return rate;
        }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWin() {
        return win;
    }
    
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }
 }
