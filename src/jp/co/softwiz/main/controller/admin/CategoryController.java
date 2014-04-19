/*
 * タイトル：カテゴリ画面
 * 説明    ：
 *
 * 著作権  ：Copyright(c) 2014 SOFTWIZ
 * 会社名  ：株式会社 SOFTWIZ
 *
 * 変更履歴   ：2014/04/04
 * 新規登録   :
 */

package jp.co.softwiz.main.controller.admin;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import jp.co.softwiz.main.common.constants.ModelConstants;
import jp.co.softwiz.main.domain.admin.CateMainBean;
import jp.co.softwiz.main.domain.admin.CateSubBean;
import jp.co.softwiz.main.service.iface.admin.CategoryServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.google.gson.Gson;



/**
 * @author jk-yun@softwiz.jp
 * @version 1.0
 */
@Controller
public class CategoryController {

	//カテゴリサービス(DI)
	@Autowired private CategoryServiceInterface	categoryService;

	/**
	 * カテゴリ画面初期
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATEGORY)
    public ModelAndView initPage(HttpServletRequest request, CateMainBean bean)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
		ModelAndView view = new ModelAndView(ModelConstants.PAGE_MODEL_CATEGORY_MAIN);

		//属性情報取得
		Map<String, ?> map = RequestContextUtils.getInputFlashMap(request);
		if (map != null) {
			bean = (CateMainBean) map.get("bean");
		}
        view.addObject("list", categoryService.selectMasterList(bean));
        view.addObject("info", bean);
       return view;
    }

	/** カテゴリビュー
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATEGORY_VIEW, method = RequestMethod.POST)
    public ModelAndView categoryViewPage(HttpServletRequest request, CateMainBean bean)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
        ModelAndView view = new ModelAndView(ModelConstants.PAGE_MODEL_CATEGORY_VIEW);

        view.addObject("info", bean);
        view.addObject("bean", categoryService.selectMaster(bean));
        return view;
    }

	/** カテゴリ情報登録
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATEGORY_REGIST, method = RequestMethod.POST)
    public ModelAndView categoryRegistPage(HttpServletRequest request, CateMainBean bean)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
		ModelAndView view = new ModelAndView("redirect:.." + ModelConstants.REQ_MAPPING_CATEGORY + ".html");

		//属性情報保存
		FlashMap fm = RequestContextUtils.getOutputFlashMap(request);
		fm.put("bean", bean);

		categoryService.registMaster(request, bean);

		return view;

    }

	/** カテゴリ情報削除
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATEGORY_DELETE, method = RequestMethod.POST)
    public ModelAndView categoryDeletePage(HttpServletRequest request, CateMainBean bean)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
		ModelAndView view = new ModelAndView("redirect:.." + ModelConstants.REQ_MAPPING_CATEGORY + ".html");

		//属性情報保存
		FlashMap fm = RequestContextUtils.getOutputFlashMap(request);
		fm.put("bean", bean);

		categoryService.deleteMaster(request, bean);

		return view;

    }

	/**
	 * カテゴリ順番変更
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATE_MAIN_UPDATE, method = RequestMethod.POST)
    public ModelAndView modifyPage(HttpServletRequest request, CateMainBean bean
    									, @RequestParam("useDiv") List<String> useList)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
        ModelAndView view = new ModelAndView(ModelConstants.PAGE_MODEL_CATEGORY_MAIN);

        categoryService.setCateMainUseDivList(useList);

        view.addObject("info", bean);
        view.addObject("list", categoryService.selectMasterList(bean));
        return view;
    }

	/** カテゴリビュー
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATEGORY_SUB_VIEW, method = RequestMethod.POST)
    public ModelAndView categorySubViewPage(HttpServletRequest request, CateSubBean bean)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
        ModelAndView view = new ModelAndView(ModelConstants.PAGE_MODEL_CATEGORY_SUB_VIEW);

        view.addObject("info", bean);
        view.addObject("bean", categoryService.selectDetail(bean));
        return view;
    }

	/** カテゴリ情報登録
	 * @param
	 * @return ModelAndView
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_CATEGORY_SUB_REGIST, method = RequestMethod.POST)
    public ModelAndView categorySubRegistPage(HttpServletRequest request, CateMainBean mainBean, CateSubBean bean)
    {
		/********************************************************************************/
		/* ModelAndView 生成 */
		/********************************************************************************/
		ModelAndView view = new ModelAndView("redirect:.." + ModelConstants.REQ_MAPPING_CATEGORY + ".html");

		//属性情報保存
		FlashMap fm = RequestContextUtils.getOutputFlashMap(request);
		fm.put("bean", mainBean);

		categoryService.registDetail(request, bean);

		return view;

    }

	/**
	 * 共通項目中分類リストを取得する。
	 * @param request
	 * @param response
	 * @param mainCode
	 * @return
	 * @see
	 *
	 */
	@RequestMapping(value = ModelConstants.REQ_MAPPING_GET_CATE_SUB_LIST, method = RequestMethod.POST)
	public @ResponseBody String getCateSubList(HttpServletRequest request, CateMainBean bean) {

		List<CateSubBean> subList =  categoryService.selectDetailList(bean);
		Gson gson = new Gson();
		System.out.println(gson.toJson(subList));
		return gson.toJson(subList);
	}


}
