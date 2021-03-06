package cn.com.stableloan.ui.adapter;

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


/**
 * Created by apple on 2017/4/11.
 */

public class Recycler_Classify_Adapter extends BaseQuickAdapter<Class_ListProductBean.ProductBean,BaseViewHolder> {


    public Recycler_Classify_Adapter(List<Class_ListProductBean.ProductBean> data) {
        super(R.layout.product_trem, data);

    }
    @Override
    protected void convert(BaseViewHolder helper,Class_ListProductBean.ProductBean item) {
        int indexOf = mData.indexOf(item);
        switch (indexOf){
            case 0:
                helper.getView(R.id.top).setVisibility(View.VISIBLE);
                break;
            case 1:
                helper.getView(R.id.top).setVisibility(View.VISIBLE);
                break;
            case 2:
                helper.getView(R.id.top).setVisibility(View.VISIBLE);
                break;
            default:
                helper.getView(R.id.top).setVisibility(View.GONE);
                break;
        }
        SuperTextView view = (SuperTextView) helper.getView(R.id.label1);
        SuperTextView view1 = (SuperTextView) helper.getView(R.id.label2);
        SuperTextView view2 = (SuperTextView) helper.getView(R.id.label3);
        SuperTextView view3 = (SuperTextView) helper.getView(R.id.label4);
        TextView view4 = (TextView) helper.getView(R.id.shengluehao);

        if(item.getLabels()!=null&&item.getLabels().size()>0){
            int size = item.getLabels().size();
            List<Class_ListProductBean.ProductBean.LabelsBean> lables = item.getLabels();
            switch (size){
                case 0:
                    break;
                case 1:
                    view.setVisibility(View.VISIBLE);
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
                    break;
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

                    view4.setVisibility(View.VISIBLE);
                    break;
            }
        }else {
            view.setVisibility(View.GONE);
            view1.setVisibility(View.GONE);
            view2.setVisibility(View.GONE);
            view3.setVisibility(View.GONE);
            view4.setVisibility(View.GONE);

        }
        helper.setText(R.id.product_list_name,item.getPname())
                .setText(R.id.rate,item.getFastest_time())
                .setText(R.id.tv_Limit,item.getMin_algorithm()+"%");
        helper.setText(R.id.product_introduction,item.getProduct_introduction());
        Glide.with(mContext).load(item.getProduct_logo()).crossFade().diskCacheStrategy(DiskCacheStrategy.SOURCE).into((ImageView) helper.getView(R.id.ic_product_logo));

       /* if(mData.indexOf(item)){
            helper.getView(R.id.top).setVisibility(View.GONE);
        }else {
            helper.getView(R.id.top).setVisibility(View.VISIBLE);
        }*/
        //helper.setText(R.id.tv_ProductName,item.getPname());

        //Glide.with(mContext).load(str+item.getLogo()).crossFade().centerCrop().bitmapTransform(new CropCircleTransformation(mContext) ).placeholder(R.mipmap.logo).placeholder(R.mipmap.logo).diskCacheStrategy(DiskCacheStrategy.SOURCE).into((ImageView) helper.getView(R.id.head));

       // Glide.with(mContext).load(R.mipmap.new_product).crossFade().centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE).into((ImageView) helper.getView(R.id.biaoqian));
    }
}
