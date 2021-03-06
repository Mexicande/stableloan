package cn.com.stableloan.ui.adapter;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coorchice.library.SuperTextView;

import java.util.List;

import cn.com.stableloan.R;
import cn.com.stableloan.model.Class_ListProductBean;
import jp.wasabeef.glide.transformations.CropCircleTransformation;


/**
 * Created by apple on 2017/5/22.
 */

public class ListProductAdapter  extends BaseQuickAdapter<Class_ListProductBean.ProductBean,BaseViewHolder>{

    public ListProductAdapter(List<Class_ListProductBean.ProductBean> data) {
        super(R.layout.news_product_trem, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Class_ListProductBean.ProductBean item) {

            Glide.with(mContext).load(item.getProduct_logo()).crossFade().centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .bitmapTransform(new CropCircleTransformation(mContext)).into((ImageView) helper.getView(R.id.ic_product_logo));

        SuperTextView view = (SuperTextView) helper.getView(R.id.label1);
        SuperTextView view1 = (SuperTextView) helper.getView(R.id.label2);
        SuperTextView view2 = (SuperTextView) helper.getView(R.id.label3);
        SuperTextView view3 = (SuperTextView) helper.getView(R.id.label4);
        TextView view5 = (TextView) helper.getView(R.id.shengluehao);

        if(item.getLabels()!=null){
            int size = item.getLabels().size();
            List<Class_ListProductBean.ProductBean.LabelsBean> lables = item.getLabels();
            switch (size){
                case 0:
                    break;
                case 1:
                    view.setVisibility(View.VISIBLE);
                    view.setWidth(20);
                    view.setTextColor(Color.parseColor(lables.get(0).getFont()));
                    view.setSolid(Color.parseColor(lables.get(0).getBackground()));
                    view.setStrokeColor(Color.parseColor(lables.get(0).getFont()));
                    view.setText(lables.get(0).getName());
                    break;
                case 2:
                    view.setVisibility(View.VISIBLE);
                    view.setTextColor(Color.parseColor(lables.get(0).getFont()));
                    view.setSolid(Color.parseColor(lables.get(0).getBackground()));
                    view.setStrokeColor(Color.parseColor(lables.get(0).getFont()));
                    view.setText(lables.get(0).getName());

                    view1.setVisibility(View.VISIBLE);
                    view1.setTextColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setSolid(Color.parseColor(lables.get(1).getBackground()));
                    view1.setStrokeColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setText(lables.get(1).getName());

                    break;
                case 3:
                    view.setVisibility(View.VISIBLE);
                    view.setTextColor(Color.parseColor(lables.get(0).getFont()));
                    view.setSolid(Color.parseColor(lables.get(0).getBackground()));
                    view.setStrokeColor(Color.parseColor(lables.get(0).getFont()));
                    view.setText(lables.get(0).getName());
                    view1.setVisibility(View.VISIBLE);
                    view1.setTextColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setSolid(Color.parseColor(lables.get(1).getBackground()));
                    view1.setStrokeColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setText(lables.get(1).getName());
                    view2.setVisibility(View.VISIBLE);
                    view2.setTextColor(Color.parseColor(lables.get(2).getFont()));
                    view2.setSolid(Color.parseColor(lables.get(2).getBackground()));
                    view2.setStrokeColor(Color.parseColor(lables.get(2).getFont()));
                    view2.setText(lables.get(2).getName());
                    break;
                case 4:
                    view.setVisibility(View.VISIBLE);
                    view.setTextColor(Color.parseColor(lables.get(0).getFont()));
                    view.setSolid(Color.parseColor(lables.get(0).getBackground()));
                    view.setStrokeColor(Color.parseColor(lables.get(0).getFont()));
                    view.setText(lables.get(0).getName());

                    view1.setVisibility(View.VISIBLE);
                    view1.setTextColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setSolid(Color.parseColor(lables.get(1).getBackground()));
                    view1.setStrokeColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setText(lables.get(1).getName());


                    view2.setVisibility(View.VISIBLE);
                    view2.setTextColor(Color.parseColor(lables.get(2).getFont()));
                    view2.setSolid(Color.parseColor(lables.get(2).getBackground()));
                    view2.setStrokeColor(Color.parseColor(lables.get(2).getFont()));
                    view2.setText(lables.get(2).getName());

                    view3.setVisibility(View.VISIBLE);
                    view3.setTextColor(Color.parseColor(lables.get(3).getFont()));
                    view3.setSolid(Color.parseColor(lables.get(3).getBackground()));
                    view3.setStrokeColor(Color.parseColor(lables.get(3).getFont()));
                    view3.setText(lables.get(3).getName());
                default:
                    view.setVisibility(View.VISIBLE);
                    view.setTextColor(Color.parseColor(lables.get(0).getFont()));
                    view.setSolid(Color.parseColor(lables.get(0).getBackground()));
                    view.setStrokeColor(Color.parseColor(lables.get(0).getFont()));
                    view.setText(lables.get(0).getName());

                    view1.setVisibility(View.VISIBLE);
                    view1.setTextColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setSolid(Color.parseColor(lables.get(1).getBackground()));
                    view1.setStrokeColor(Color.parseColor(lables.get(1).getFont()));
                    view1.setText(lables.get(1).getName());


                    view2.setVisibility(View.VISIBLE);
                    view2.setTextColor(Color.parseColor(lables.get(2).getFont()));
                    view2.setSolid(Color.parseColor(lables.get(2).getBackground()));
                    view2.setStrokeColor(Color.parseColor(lables.get(2).getFont()));
                    view2.setText(lables.get(2).getName());

                    view3.setVisibility(View.VISIBLE);
                    view3.setTextColor(Color.parseColor(lables.get(3).getFont()));
                    view3.setSolid(Color.parseColor(lables.get(3).getBackground()));
                    view3.setStrokeColor(Color.parseColor(lables.get(3).getFont()));
                    view3.setText(lables.get(3).getName());

                    view5.setVisibility(View.VISIBLE);
                    break;
            }
        }
            helper.setText(R.id.product_list_desc,item.getProduct_introduction())
                    .setText(R.id.tv_Pname,item.getPname());



    }

}
