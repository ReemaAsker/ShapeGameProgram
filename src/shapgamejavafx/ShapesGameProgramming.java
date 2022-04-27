package startjavafx;
//javafx

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ShapesGameProgramming extends Application {

    Button rotateRecB, fillRecB, rotateSquaB, fillSquaB, rotateCirB, fillCirB, rotateTriB, fillTriB, rotateAndFill_All, checkRec, checkSqua, checkCir, checkTri;
    ImageView imgview_Background, imgViewSqua_rotate = null, imgViewSqua_fill = null, imgViewCir_rotate = null, imgViewCir_fill = null, imgViewTri_rotate = null, imgViewTri_fill = null, imgView_CheckRecAnswer = null, imgView_CheckSquaAnswer = null, imgView_CheckCirAnswer = null, imgView_CheckTriAnswer = null, imgView_Smile = null, imgView_Sad = null;
    FileInputStream picture_RotateRec = null, picture_FillRec = null;
    Label theShapIs, iconcheck_Smile, iconcheck_Sad;
    TextField putTheAnswer_firstShap, putTheAnswer_SecoundShap, putTheAnswer_ThirdShap, putTheAnswer_ForthShap;

    @Override
    public void start(Stage s) {

        try {
            s.getIcons().add(new Image(new FileInputStream("game Icon.png")));//change application icon
        } catch (FileNotFoundException ex) {

        }

        s.setTitle("Shapes game");
        Group g = new Group();
        Scene scene = new Scene(g, 650, 510);
        Text title_Sence = new Text(150, 50, "The Shapes Game");
        Font font_Title = new Font("Edwardian Script ITC", 45);
        DropShadow shadow = new DropShadow(6, 4, 4, Color.CORAL);
        title_Sence.setFont(font_Title);
        title_Sence.setEffect(shadow);

        theShapIs = new Label("  The Shape is ? ");
        theShapIs.setFont(Font.font("century gothic", FontWeight.BOLD, 15));
        theShapIs.setLayoutX(360);
        theShapIs.setLayoutY(80);
        theShapIs.setBorder(new Border(new BorderStroke(Color.BLUEVIOLET, BorderStrokeStyle.DASHED, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        theShapIs.setTextFill(Color.MIDNIGHTBLUE);

        Image img_Background = null;
        try {
            img_Background = new Image(new FileInputStream("background.jpg"));

        } catch (FileNotFoundException ex) {
        }
        imgview_Background = new ImageView(img_Background);
        imgview_Background.setFitHeight(scene.getHeight());
        imgview_Background.setFitWidth(scene.getWidth());
        g.getChildren().addAll(imgview_Background, title_Sence, theShapIs);

        try {
            picture_RotateRec = new FileInputStream("rotate.png");
            picture_FillRec = new FileInputStream("fill.png");

        } catch (FileNotFoundException ex) {
        }

        Image rotateRec_icon = new Image(picture_RotateRec);
        ImageView imgViewRec_rotate = new ImageView(rotateRec_icon);
        imgViewRec_rotate.setFitHeight(20);
        imgViewRec_rotate.setFitWidth(20);
        Image fillRec_icon = new Image(picture_FillRec);
        ImageView imgViewRec_fill = new ImageView(fillRec_icon);
        imgViewRec_fill.setFitHeight(20);
        imgViewRec_fill.setFitWidth(20);

        try {

            imgViewSqua_rotate = new ImageView(new Image(new FileInputStream("rotate.png")));
            imgViewSqua_rotate.setFitHeight(20);
            imgViewSqua_rotate.setFitWidth(20);
            imgViewSqua_fill = new ImageView(new Image(new FileInputStream("fill.png")));
            imgViewSqua_fill.setFitHeight(20);
            imgViewSqua_fill.setFitWidth(20);

            imgViewCir_rotate = new ImageView(new Image(new FileInputStream("rotate.png")));
            imgViewCir_rotate.setFitHeight(20);
            imgViewCir_rotate.setFitWidth(20);
            imgViewCir_fill = new ImageView(new Image(new FileInputStream("fill.png")));
            imgViewCir_fill.setFitHeight(20);
            imgViewCir_fill.setFitWidth(20);

            imgViewTri_rotate = new ImageView(new Image(new FileInputStream("rotate.png")));
            imgViewTri_rotate.setFitHeight(20);
            imgViewTri_rotate.setFitWidth(20);
            imgViewTri_fill = new ImageView(new Image(new FileInputStream("fill.png")));
            imgViewTri_fill.setFitHeight(20);
            imgViewTri_fill.setFitWidth(20);

            imgView_CheckRecAnswer = new ImageView(new Image(new FileInputStream("check.png")));
            imgView_CheckRecAnswer.setFitHeight(20);
            imgView_CheckRecAnswer.setFitWidth(20);

            imgView_CheckSquaAnswer = new ImageView(new Image(new FileInputStream("check.png")));
            imgView_CheckSquaAnswer.setFitHeight(20);
            imgView_CheckSquaAnswer.setFitWidth(20);

            imgView_CheckCirAnswer = new ImageView(new Image(new FileInputStream("check.png")));
            imgView_CheckCirAnswer.setFitHeight(20);
            imgView_CheckCirAnswer.setFitWidth(20);

            imgView_CheckTriAnswer = new ImageView(new Image(new FileInputStream("check.png")));
            imgView_CheckTriAnswer.setFitHeight(20);
            imgView_CheckTriAnswer.setFitWidth(20);

            imgView_Smile = new ImageView(new Image(new FileInputStream("smile.png")));
            imgView_Smile.setFitHeight(35);
            imgView_Smile.setFitWidth(35);

            imgView_Sad = new ImageView(new Image(new FileInputStream("sad.png")));
            imgView_Sad.setFitHeight(35);
            imgView_Sad.setFitWidth(35);

        } catch (FileNotFoundException ex) {
        }

        iconcheck_Smile = new Label();
        iconcheck_Smile.setGraphic(imgView_Smile);

        iconcheck_Sad = new Label();
        iconcheck_Sad.setGraphic(imgView_Sad);

//Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setX(230);
        rectangle.setY(120);
        rectangle.setWidth(100);
        rectangle.setHeight(50);
        rectangle.setEffect(shadow);
        rectangle.setStroke(Color.rgb(66, 2, 108));
        rectangle.setFill(null);
        /*rectangle.setArcHeight(60);
    rectangle.setArcWidth(40);*/// لجعل الحواف مدورة

        rotateRecB = new Button(" Rotate ", imgViewRec_rotate);
        // rotateRecB.setGraphic(iw);
        rotateRecB.setContentDisplay(ContentDisplay.RIGHT);
        rotateRecB.setLayoutX(17);
        rotateRecB.setLayoutY(120);
        rotateRecB.setFocusTraversable(false);
        rotateRecB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        rotateRecB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        fillRecB = new Button("  Fill  ", imgViewRec_fill);
        fillRecB.setContentDisplay(ContentDisplay.RIGHT);
        fillRecB.setLayoutX(125);
        fillRecB.setLayoutY(120);
        fillRecB.setFocusTraversable(false);
        fillRecB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        fillRecB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        fillRecB.setEffect(shadow);
//square
        Rectangle square = new Rectangle(60, 60);
        square.setLayoutX(255);
        square.setLayoutY(190);
        square.setEffect(shadow);
        square.setStroke(Color.rgb(66, 2, 108));
        square.setFill(null);

        rotateSquaB = new Button(" Rotate ", imgViewSqua_rotate);
        rotateSquaB.setContentDisplay(ContentDisplay.RIGHT);
        rotateSquaB.setLayoutX(17);
        rotateSquaB.setLayoutY(200);
        rotateSquaB.setFocusTraversable(false);
        rotateSquaB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        rotateSquaB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        rotateSquaB.setEffect(shadow);

        fillSquaB = new Button("  Fill  ", imgViewSqua_fill);
        fillSquaB.setContentDisplay(ContentDisplay.RIGHT);
        fillSquaB.setLayoutX(125);
        fillSquaB.setLayoutY(200);
        fillSquaB.setFocusTraversable(false);
        fillSquaB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        fillSquaB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
//Circle
        Circle circle = new Circle(35);
        circle.setLayoutX(285);
        circle.setLayoutY(310);
        circle.setEffect(shadow);
        circle.setStroke(Color.rgb(66, 2, 108));
        circle.setFill(null);

        rotateCirB = new Button(" Rotate ", imgViewCir_rotate);
        rotateCirB.setContentDisplay(ContentDisplay.RIGHT);
        rotateCirB.setLayoutX(17);
        rotateCirB.setLayoutY(290);
        rotateCirB.setFocusTraversable(false);
        rotateCirB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        rotateCirB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        fillCirB = new Button("  Fill  ", imgViewCir_fill);
        fillCirB.setContentDisplay(ContentDisplay.RIGHT);
        fillCirB.setLayoutX(125);
        fillCirB.setLayoutY(290);
        fillCirB.setFocusTraversable(false);
        fillCirB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        fillCirB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        fillCirB.setEffect(shadow);

        Polygon triangle = new Polygon(280, 370, 230, 440, 330, 440);
        triangle.setEffect(shadow);
        triangle.setStroke(Color.rgb(66, 2, 108));
        triangle.setFill(null);

        rotateTriB = new Button(" Rotate ", imgViewTri_rotate);
        rotateTriB.setContentDisplay(ContentDisplay.RIGHT);
        rotateTriB.setLayoutX(17);
        rotateTriB.setLayoutY(390);
        rotateTriB.setFocusTraversable(false);
        rotateTriB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        rotateTriB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        fillTriB = new Button("  Fill  ", imgViewTri_fill);
        fillTriB.setContentDisplay(ContentDisplay.RIGHT);
        fillTriB.setLayoutX(125);
        fillTriB.setLayoutY(390);
        fillTriB.setFocusTraversable(false);
        fillTriB.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        fillTriB.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        fillTriB.setEffect(shadow);

        rotateAndFill_All = new Button(" Rotate, Fill and Write the Shapes Name All Shapes ");
        rotateAndFill_All.setLayoutX(130);
        rotateAndFill_All.setLayoutY(470);
        rotateAndFill_All.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        rotateAndFill_All.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        rotateAndFill_All.setEffect(shadow);

        RotateTransition rotate = new RotateTransition(Duration.millis(2000));
        rotate.setByAngle(360);
        rotate.setCycleCount(2);
        rotate.setAutoReverse(true);

        DropShadow shadowTextField = new DropShadow();

        putTheAnswer_firstShap = new TextField();
        putTheAnswer_SecoundShap = new TextField();
        putTheAnswer_ThirdShap = new TextField();
        putTheAnswer_ForthShap = new TextField();

        putTheAnswer_firstShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        putTheAnswer_firstShap.setTranslateX(360);
        putTheAnswer_firstShap.setTranslateY(120);
        putTheAnswer_firstShap.setPrefSize(120, 30);
        putTheAnswer_firstShap.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            putTheAnswer_firstShap.setEffect(shadowTextField);
            putTheAnswer_firstShap.setTooltip(new Tooltip("Write the answer here"));

        });
        putTheAnswer_firstShap.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            putTheAnswer_firstShap.setEffect(null);
        });
        putTheAnswer_firstShap.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            putTheAnswer_SecoundShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_SecoundShap.setText("");
            putTheAnswer_SecoundShap.setOpacity(1);
            putTheAnswer_ThirdShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_ThirdShap.setText("");
            putTheAnswer_ThirdShap.setOpacity(1);
            putTheAnswer_ForthShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_ForthShap.setText("");
            putTheAnswer_ForthShap.setOpacity(1);
            g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);

        });
        putTheAnswer_SecoundShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        putTheAnswer_SecoundShap.setTranslateX(360);
        putTheAnswer_SecoundShap.setTranslateY(200);
        putTheAnswer_SecoundShap.setPrefSize(120, 30);
        putTheAnswer_SecoundShap.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            putTheAnswer_SecoundShap.setEffect(shadowTextField);
            putTheAnswer_SecoundShap.setTooltip(new Tooltip("Write the answer here"));
        });
        putTheAnswer_SecoundShap.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            putTheAnswer_SecoundShap.setEffect(null);
        });
        putTheAnswer_SecoundShap.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            putTheAnswer_firstShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_firstShap.setText("");
            putTheAnswer_firstShap.setOpacity(1);
            putTheAnswer_ThirdShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_ThirdShap.setText("");
            putTheAnswer_ThirdShap.setOpacity(1);
            putTheAnswer_ForthShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_ForthShap.setText("");
            putTheAnswer_ForthShap.setOpacity(1);
            g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);

        });
        putTheAnswer_ThirdShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        putTheAnswer_ThirdShap.setTranslateX(360);
        putTheAnswer_ThirdShap.setTranslateY(290);
        putTheAnswer_ThirdShap.setPrefSize(120, 30);
        putTheAnswer_ThirdShap.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            putTheAnswer_ThirdShap.setEffect(shadowTextField);
            putTheAnswer_ThirdShap.setTooltip(new Tooltip("Write the answer here"));
        });
        putTheAnswer_ThirdShap.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            putTheAnswer_ThirdShap.setEffect(null);
        });
        putTheAnswer_ThirdShap.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            putTheAnswer_firstShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_firstShap.setText("");
            putTheAnswer_firstShap.setOpacity(1);
            putTheAnswer_SecoundShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_SecoundShap.setText("");
            putTheAnswer_SecoundShap.setOpacity(1);
            putTheAnswer_ForthShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_ForthShap.setText("");
            putTheAnswer_ForthShap.setOpacity(1);
            g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);

        });
        putTheAnswer_ForthShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        putTheAnswer_ForthShap.setTranslateX(360);
        putTheAnswer_ForthShap.setTranslateY(390);
        putTheAnswer_ForthShap.setPrefSize(120, 30);

        putTheAnswer_ForthShap.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
            putTheAnswer_ForthShap.setEffect(shadowTextField);
            putTheAnswer_ForthShap.setTooltip(new Tooltip("Write the answer here"));
        });
        putTheAnswer_ForthShap.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
            putTheAnswer_ForthShap.setEffect(null);
        });
        putTheAnswer_ForthShap.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            putTheAnswer_firstShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_firstShap.setText("");
            putTheAnswer_firstShap.setOpacity(1);
            putTheAnswer_SecoundShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_SecoundShap.setText("");
            putTheAnswer_SecoundShap.setOpacity(1);
            putTheAnswer_ThirdShap.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            putTheAnswer_ThirdShap.setText("");
            putTheAnswer_ThirdShap.setOpacity(1);
            g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);

        });
        checkRec = new Button("Check", imgView_CheckRecAnswer);
        checkRec.setContentDisplay(ContentDisplay.RIGHT);
        checkRec.setLayoutX(500);
        checkRec.setLayoutY(120);
        checkRec.setFocusTraversable(false);
        checkRec.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        checkRec.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        try {
            checkRec.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
                if (putTheAnswer_firstShap.getText().equalsIgnoreCase("rectangle")) {
                    putTheAnswer_firstShap.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    iconcheck_Smile.setLayoutX(checkRec.getLayoutX() + 90);
                    iconcheck_Smile.setLayoutY(checkRec.getLayoutY());
                    g.getChildren().add(iconcheck_Smile);
                    g.getChildren().remove(iconcheck_Sad);
                } else {

                    putTheAnswer_firstShap.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    putTheAnswer_firstShap.setEffect(new DropShadow());
                    putTheAnswer_firstShap.setOpacity(.8);
                    iconcheck_Sad.setLayoutX(checkRec.getLayoutX() + 90);
                    iconcheck_Sad.setLayoutY(checkRec.getLayoutY());
                    g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);
                    g.getChildren().add(iconcheck_Sad);
                }
            });
        } catch (Exception ex) {
        }

        checkSqua = new Button("Check", imgView_CheckSquaAnswer);
        checkSqua.setContentDisplay(ContentDisplay.RIGHT);
        checkSqua.setLayoutX(500);
        checkSqua.setLayoutY(200);
        checkSqua.setFocusTraversable(false);
        checkSqua.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        checkSqua.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        checkSqua.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            try {
                if (putTheAnswer_SecoundShap.getText().equalsIgnoreCase("square")) {
                    putTheAnswer_SecoundShap.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    iconcheck_Smile.setLayoutX(checkSqua.getLayoutX() + 90);
                    iconcheck_Smile.setLayoutY(checkSqua.getLayoutY());
                    g.getChildren().add(iconcheck_Smile);
                    g.getChildren().remove(iconcheck_Sad);
                } else {
                    putTheAnswer_SecoundShap.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    putTheAnswer_SecoundShap.setEffect(new DropShadow());
                    putTheAnswer_SecoundShap.setOpacity(.8);
                    iconcheck_Sad.setLayoutX(checkSqua.getLayoutX() + 90);
                    iconcheck_Sad.setLayoutY(checkSqua.getLayoutY());
                    g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);
                    g.getChildren().add(iconcheck_Sad);

                }
            } catch (Exception ex) {

            }

        });

        checkCir = new Button("Check", imgView_CheckCirAnswer);
        checkCir.setContentDisplay(ContentDisplay.RIGHT);
        checkCir.setLayoutX(500);
        checkCir.setLayoutY(290);
        checkCir.setFocusTraversable(false);
        checkCir.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        checkCir.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        checkCir.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            try {
                if (putTheAnswer_ThirdShap.getText().equalsIgnoreCase("circle")) {
                    putTheAnswer_ThirdShap.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    iconcheck_Smile.setLayoutX(checkCir.getLayoutX() + 90);
                    iconcheck_Smile.setLayoutY(checkCir.getLayoutY());
                    g.getChildren().add(iconcheck_Smile);
                    g.getChildren().remove(iconcheck_Sad);
                } else {
                    putTheAnswer_ThirdShap.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    putTheAnswer_ThirdShap.setEffect(new DropShadow());
                    putTheAnswer_ThirdShap.setOpacity(.8);
                    iconcheck_Sad.setLayoutX(checkCir.getLayoutX() + 90);
                    iconcheck_Sad.setLayoutY(checkCir.getLayoutY());
                    g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);
                    g.getChildren().add(iconcheck_Sad);

                }
            } catch (Exception ex) {
            }
        });

        checkTri = new Button("Check", imgView_CheckTriAnswer);
        checkTri.setContentDisplay(ContentDisplay.RIGHT);
        checkTri.setLayoutX(500);
        checkTri.setLayoutY(390);
        checkTri.setFocusTraversable(false);
        checkTri.setFont(Font.font("century gothic", FontWeight.BOLD, 12));
        checkTri.setBorder(new Border(new BorderStroke(Color.rgb(159, 64, 207), BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        try {
            checkTri.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
                if (putTheAnswer_ForthShap.getText().equalsIgnoreCase(null)) {
                    putTheAnswer_ForthShap.setTooltip(new Tooltip("the answer?"));
                } else if (putTheAnswer_ForthShap.getText().equalsIgnoreCase("triangle")) {
                    putTheAnswer_ForthShap.setBorder(new Border(new BorderStroke(Color.BLUE, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    iconcheck_Smile.setLayoutX(checkTri.getLayoutX() + 90);
                    iconcheck_Smile.setLayoutY(checkTri.getLayoutY());
                    g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);
                    g.getChildren().add(iconcheck_Smile);
                } else {
                    putTheAnswer_ForthShap.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
                    putTheAnswer_ForthShap.setEffect(new DropShadow());
                    putTheAnswer_ForthShap.setOpacity(.8);
                    iconcheck_Sad.setLayoutX(checkTri.getLayoutX() + 90);
                    iconcheck_Sad.setLayoutY(checkTri.getLayoutY());
                    g.getChildren().removeAll(iconcheck_Smile, iconcheck_Sad);
                    g.getChildren().add(iconcheck_Sad);

                }

            });
        } catch (Exception ex) {
        }

        g.getChildren().addAll(rectangle, square, circle, triangle, rotateRecB, rotateCirB, rotateSquaB, rotateTriB, fillRecB, fillSquaB, fillCirB, fillTriB, rotateAndFill_All, putTheAnswer_firstShap, putTheAnswer_SecoundShap, putTheAnswer_ThirdShap, putTheAnswer_ForthShap, checkRec, checkSqua, checkCir, checkTri);

        rotateRecB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateRecB.setFocusTraversable(true);
                rotate.setNode(rectangle);
                rotate.play();
                rectangle.setFill(null);

            }
        });
        fillRecB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateRecB.setFocusTraversable(false);
                fillRecB.setFocusTraversable(true);
                rectangle.setFill(Color.rgb(86, 221, 251));

            }
        });

        rotateSquaB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateSquaB.setFocusTraversable(true);
                fillSquaB.setFocusTraversable(true);
                rotate.setNode(square);
                rotate.play();
                square.setFill(null);
            }
        });
        fillSquaB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateSquaB.setFocusTraversable(false);
                fillSquaB.setFocusTraversable(true);
                square.setFill(Color.rgb(86, 221, 251));

            }
        });

        rotateCirB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateCirB.setFocusTraversable(true);
                fillCirB.setFocusTraversable(true);
                rotate.setNode(circle);
                rotate.play();
                circle.setFill(null);

            }

        });
        fillCirB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateCirB.setFocusTraversable(false);
                fillCirB.setFocusTraversable(true);
                circle.setFill(Color.rgb(86, 221, 251));

            }
        });

        rotateTriB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateTriB.setFocusTraversable(true);
                fillTriB.setFocusTraversable(true);
                rotate.setNode(triangle);
                rotate.play();
                triangle.setFill(null);

            }

        });
        fillTriB.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                rotateTriB.setFocusTraversable(false);
                fillTriB.setFocusTraversable(true);
                triangle.setFill(Color.rgb(86, 221, 251));

            }
        });
        rotateAndFill_All.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                rotateRecB.setFocusTraversable(false);
                rotateSquaB.setFocusTraversable(false);
                rotateCirB.setFocusTraversable(false);
                rotateTriB.setFocusTraversable(false);
                rectangle.setFill(Color.rgb(86, 221, 251));
                square.setFill(Color.rgb(86, 221, 251));
                circle.setFill(Color.rgb(86, 221, 251));
                triangle.setFill(Color.rgb(86, 221, 251));

                RotateTransition rotate1 = new RotateTransition(Duration.millis(2000));
                rotate1.setByAngle(360);
                rotate1.setCycleCount(2);
                rotate1.setAutoReverse(true);
                rotate1.setNode(rectangle);
                rotate1.play();

                RotateTransition rotate2 = new RotateTransition(Duration.millis(2000));
                rotate2.setByAngle(360);
                rotate2.setCycleCount(2);
                rotate2.setAutoReverse(true);
                rotate2.setNode(square);
                rotate2.play();

                RotateTransition rotate3 = new RotateTransition(Duration.millis(2000));
                rotate3.setByAngle(360);
                rotate3.setCycleCount(2);
                rotate3.setAutoReverse(true);
                rotate3.setNode(circle);
                rotate3.play();

                RotateTransition rotate4 = new RotateTransition(Duration.millis(2000));
                rotate4.setByAngle(360);
                rotate4.setCycleCount(2);
                rotate4.setAutoReverse(true);
                rotate4.setNode(triangle);
                rotate4.play();

                putTheAnswer_firstShap.setText("Rectangle");
                putTheAnswer_SecoundShap.setText("Square");
                putTheAnswer_ThirdShap.setText("Circle");
                putTheAnswer_ForthShap.setText("Triangle");

            }

        });

        s.setScene(scene);
        s.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
