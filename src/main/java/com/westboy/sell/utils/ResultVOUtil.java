package com.westboy.sell.utils;

import com.westboy.sell.vo.ResultVO;

/**
 * @author: wangpengbo
 * @date: 2017/11/22
 */
public class ResultVOUtil {

      public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }


    public static <T> ResultVO success(T data) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(data);
        return resultVO;
    }
}
