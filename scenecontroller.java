/*normal 5usd vip 7 usd ikili 16 usd*/
package com.example.cinema_reservation_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class scenecontroller {
    @FXML
            Stage stage;
    @FXML
            Scene scene;
Image cinemaimg=new Image("file:\\C:\\Users\\Dell\\IdeaProjects\\cinema_reservation_system\\src\\main\\resources\\com\\example\\cinema_reservation_system\\cinemapicture.jpg") ;
public ImageView cinemajpg = new ImageView(cinemaimg);
@FXML
Button button1=new Button();
    @FXML
Button button2=new Button();
    @FXML
Button button3=new Button();
    @FXML
Button button4=new Button();
    @FXML
Button button5=new Button();
    @FXML
Button button6=new Button();
    @FXML
Button button7=new Button();
    @FXML
Button button8=new Button();
    @FXML
Button button9=new Button();
    @FXML
Button button10=new Button();
    @FXML
Button button11=new Button();
    @FXML
Button button12=new Button();
    @FXML
    Button button13=new Button();
    @FXML
    Button button14=new Button();
    @FXML
    Button button15=new Button();
    @FXML
    Button button16=new Button();
    @FXML
    Button button17=new Button();
    @FXML
    Button button18=new Button();
    @FXML
    Button button19=new Button();
    @FXML
    Button button20=new Button();
    @FXML
    Button buttonvip1=new Button();
    @FXML
    Button buttonvip2=new Button();
    @FXML
    Button buttonvip3=new Button();
    @FXML
    Button buttonvip4=new Button();
    @FXML
    Button buttonvip5=new Button();
    @FXML
    Button buttonvip6=new Button();
    @FXML
    Button buttonvip7=new Button();
    @FXML
    Button buttoncouple1=new Button();
    @FXML
    Button buttoncouple2=new Button();
    @FXML
    Button buttoncouple3=new Button();
    @FXML
    Button buttoncouple4=new Button();
    @FXML
    Button buttoncouple5=new Button();
    @FXML
    Button buttoncouple6=new Button();
    @FXML
    Button buttoncouple7=new Button();
    @FXML
    Button buttoncouple8=new Button();

int counter1=0;
int counter2=0;
int counter3=0;
int counter4=0;
int counter5=0;
int counter6=0;
int counter7=0;
int counter8=0;
int counter9=0;
int counter10=0;
int counter11=0;
int counter12=0;
    int counter13=0;
    int counter14=0;
    int counter15=0;
    int counter16=0;
    int counter17=0;
    int counter18=0;
    int counter19=0;
    int counter20=0;
    int countervip1=0;
    int countervip2=0;
    int countervip3=0;
    int countervip4=0;
    int countervip5=0;
    int countervip6=0;
    int countervip7=0;
    int countercouple1=0;
    int countercouple2=0;
    int countercouple3=0;
    int countercouple4=0;
    int countercouple5=0;
    int countercouple6=0;
    int countercouple7=0;
    int countercouple8=0;
public void button1colorchange()
{
    if(counter1%2==0)
    {
        button1.setStyle("-fx-background-color: red");
        normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
        sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
    }
    else {
        button1.setStyle("-fx-background-color: #ECECEC");
        button1.setStyle("-fx-border-color: #C0C0C0");
        normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
        sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
    }
    counter1++;
    totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


}
public void button2colorchange()
    {
        if(counter2%2==0)
        {
            button2.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button2.setStyle("-fx-background-color: #ECECEC");
            button2.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter2++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button3colorchange()
    {
        if(counter3%2==0)
        {
            button3.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button3.setStyle("-fx-background-color: #ECECEC");
            button3.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter3++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button4colorchange()
    {
        if(counter4%2==0)
        {
            button4.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button4.setStyle("-fx-background-color: #ECECEC");
            button4.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter4++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button5colorchange()
    {
        if(counter5%2==0)
        {
            button5.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button5.setStyle("-fx-background-color: #ECECEC");
            button5.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter5++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button6colorchange()
    {
        if(counter6%2==0)
        {
            button6.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button6.setStyle("-fx-background-color: #ECECEC");
            button6.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter6++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button7colorchange()
    {
        if(counter7%2==0)
        {
            button7.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button7.setStyle("-fx-background-color: #ECECEC");
            button7.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter7++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button8colorchange()
    {
        if(counter8%2==0)
        {
            button8.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button8.setStyle("-fx-background-color: #ECECEC");
            button8.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter8++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button9colorchange()
    {
        if(counter9%2==0)
        {
            button9.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button9.setStyle("-fx-background-color: #ECECEC");
            button9.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter9++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button10colorchange()
    {
        if(counter10%2==0)
        {
            button10.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button10.setStyle("-fx-background-color: #ECECEC");
            button10.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter10++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button11colorchange()
    {
        if(counter11%2==0)
        {
            button11.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button11.setStyle("-fx-background-color: #ECECEC");
            button11.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter11++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button12colorchange()
    {
        if(counter12%2==0)
        {
            button12.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button12.setStyle("-fx-background-color: #ECECEC");
            button12.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter12++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }
    public void button13colorchange()
    {
        if(counter13%2==0)
        {
            button13.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button13.setStyle("-fx-background-color: #ECECEC");
            button13.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter13++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }
    public void button14colorchange()
    {
        if(counter14%2==0)
        {
            button14.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button14.setStyle("-fx-background-color: #ECECEC");
            button14.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter14++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button15colorchange()
    {
        if(counter15%2==0)
        {
            button15.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button15.setStyle("-fx-background-color: #ECECEC");
            button15.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter15++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button16colorchange()
    {
        if(counter16%2==0)
        {
            button16.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button16.setStyle("-fx-background-color: #ECECEC");
            button16.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter16++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button17colorchange()
    {
        if(counter17%2==0)
        {
            button17.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button17.setStyle("-fx-background-color: #ECECEC");
            button17.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter17++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button18colorchange()
    {
        if(counter18%2==0)
        {
            button18.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button18.setStyle("-fx-background-color: #ECECEC");
            button18.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter18++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button19colorchange()
    {
        if(counter19%2==0)
        {
            button19.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button19.setStyle("-fx-background-color: #ECECEC");
            button19.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter19++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void button20colorchange()
    {
        if(counter20%2==0)
        {
            button20.setStyle("-fx-background-color: red");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+5));
        }
        else {
            button20.setStyle("-fx-background-color: #ECECEC");
            button20.setStyle("-fx-border-color: #C0C0C0");
            normalseat.setText(String.valueOf(Integer.parseInt(normalseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-5));
        }
        counter20++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }
    public void buttonvip1colorchange()
    {
        if(countervip1%2==0)
        {
            buttonvip1.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip1.setStyle("-fx-background-color: #ECECEC");
            buttonvip1.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip1++;

        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));
    }
    public void buttonvip2colorchange()
    {
        if(countervip2%2==0)
        {
            buttonvip2.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip2.setStyle("-fx-background-color: #ECECEC");
            buttonvip2.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip2++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }public void buttonvip3colorchange()
    {
        if(countervip3%2==0)
        {
            buttonvip3.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip3.setStyle("-fx-background-color: #ECECEC");
            buttonvip3.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip3++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }public void buttonvip4colorchange()
    {
        if(countervip4%2==0)
        {
            buttonvip4.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip4.setStyle("-fx-background-color: #ECECEC");
            buttonvip4.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip4++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }
    public void buttonvip5colorchange()
    {
        if(countervip5%2==0)
        {
            buttonvip5.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip5.setStyle("-fx-background-color: #ECECEC");
            buttonvip5.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip5++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }public void buttonvip6colorchange()
    {
        if(countervip6%2==0)
        {
            buttonvip6.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip6.setStyle("-fx-background-color: #ECECEC");
            buttonvip6.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip6++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }public void buttonvip7colorchange()
    {
        if(countervip7%2==0)
        {
            buttonvip7.setStyle("-fx-background-color: #1e90ff");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())+1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+7));
        }
        else {
            buttonvip7.setStyle("-fx-background-color: #ECECEC");
            buttonvip7.setStyle("-fx-border-color: #C0C0C0");
            vipseat.setText(String.valueOf(Integer.parseInt(vipseat.getText())-1));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-7));
        }
        countervip7++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));

    }
    public void buttoncouple12colorchange()
    {
        if(countercouple1%2==0)
        {
            buttoncouple1.setStyle("-fx-background-color: red");
            buttoncouple2.setStyle("-fx-background-color: red");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())+2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+16));
        }
        else {
            buttoncouple1.setStyle("-fx-background-color: #ECECEC");
            buttoncouple1.setStyle("-fx-border-color: #C0C0C0");
            buttoncouple2.setStyle("-fx-background-color: #ECECEC");
            buttoncouple2.setStyle("-fx-border-color: #C0C0C0");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())-2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-16));
        }
        countercouple1++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }
    public void buttoncouple34colorchange()
    {
        if(countercouple3%2==0)
        {
            buttoncouple3.setStyle("-fx-background-color: red");
            buttoncouple4.setStyle("-fx-background-color: red");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())+2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+16));
        }
        else {
            buttoncouple3.setStyle("-fx-background-color: #ECECEC");
            buttoncouple3.setStyle("-fx-border-color: #C0C0C0");
            buttoncouple4.setStyle("-fx-background-color: #ECECEC");
            buttoncouple4.setStyle("-fx-border-color: #C0C0C0");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())-2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-16));
        }
        countercouple3++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void buttoncouple56colorchange()
    {
        if(countercouple5%2==0)
        {
            buttoncouple5.setStyle("-fx-background-color: red");
            buttoncouple6.setStyle("-fx-background-color: red");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())+2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+16));
        }
        else {
            buttoncouple5.setStyle("-fx-background-color: #ECECEC");
            buttoncouple5.setStyle("-fx-border-color: #C0C0C0");
            buttoncouple6.setStyle("-fx-background-color: #ECECEC");
            buttoncouple6.setStyle("-fx-border-color: #C0C0C0");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())-2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-16));
        }
        countercouple5++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }public void buttoncouple78colorchange()
    {
        if(countercouple7%2==0)
        {
            buttoncouple7.setStyle("-fx-background-color: red");
            buttoncouple8.setStyle("-fx-background-color: red");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())+2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())+16));
        }
        else {
            buttoncouple7.setStyle("-fx-background-color: #ECECEC");
            buttoncouple7.setStyle("-fx-border-color: #C0C0C0");
            buttoncouple8.setStyle("-fx-background-color: #ECECEC");
            buttoncouple8.setStyle("-fx-border-color: #C0C0C0");
            doubleseat.setText(String.valueOf(Integer.parseInt(doubleseat.getText())-2));
            sum1.setText(String.valueOf(Integer.parseInt(sum1.getText())-16));
        }
        countercouple7++;
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));


    }
    public void tofilms(ActionEvent event) throws IOException {

        Parent root= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("films.fxml")));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    TextField corn;
@FXML
TextField sum2;
    public void cornplus()
    {
        corn.setText(String.valueOf(Integer.parseInt(corn.getText())+1));
        sum2.setText(String.valueOf(Integer.parseInt(sum2.getText())+3));
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));
    }
    public void cornminus()
    {if(Integer.parseInt(corn.getText())>0)
    {
        corn.setText(String.valueOf(Integer.parseInt(corn.getText())-1));
        sum2.setText(String.valueOf(Integer.parseInt(sum2.getText())-3));
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));
    }

    }
    @FXML
    TextField drinks;
    @FXML
    TextField totalsum;
    @FXML
    TextField sum1;
    public void drinksplus()
    {
        drinks.setText(String.valueOf(Integer.parseInt(drinks.getText())+1));
        sum2.setText(String.valueOf(Integer.parseInt(sum2.getText())+2));
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));
    }
    public void drinksminus()
    {if(Integer.parseInt(drinks.getText())>0)
    {
        drinks.setText(String.valueOf(Integer.parseInt(drinks.getText())-1));
        sum2.setText(String.valueOf(Integer.parseInt(sum2.getText())-2));
        totalsum.setText(String.valueOf(Integer.parseInt(sum1.getText())+Integer.parseInt(sum2.getText())));
    }

    }
    @FXML
    TextField normalseat;
    @FXML
    TextField vipseat;
    @FXML
    TextField doubleseat;
    public void buy(){
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setResizable(false);
        alert.setTitle("Confirmation");

        alert.setHeaderText("Pay "+totalsum.getText()+" USD?");
        alert.show();

    }

}