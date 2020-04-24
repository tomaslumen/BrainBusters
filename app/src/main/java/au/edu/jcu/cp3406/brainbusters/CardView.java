package au.edu.jcu.cp3406.brainbusters;

import android.content.Context;
import android.media.Image;
import android.widget.ImageView;

import au.edu.jcu.cp3406.brainbusters.models.Card;

public class CardView extends androidx.appcompat.widget.AppCompatImageView {

    Card card;
    ImageManager imageManager;


    public CardView(Context context) {
        super(context);
    }

    public CardView(Context context, Card card, ImageManager imageManager){
        super(context);
        this.card = card;
        this.imageManager = imageManager;
        setImageBitmap(imageManager.getCardImage(card));
    }

    public Card getCard() {
        return card;
    }

    public void showCard(){
        setImageBitmap(imageManager.getCardFace(card));
    }

    public void hideCard(){
        setImageBitmap(imageManager.getCardBack());
    }


}
