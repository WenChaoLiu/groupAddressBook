<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>集团通讯录</title>
<%@include file="../common/baseIncludeJs.jsp"%>
<link rel="stylesheet" type="text/css" href="/resources/css/pagination.css" />
<script type="text/javascript" src="/resources/js/common/jquery.pagination.js"></script>
<script type="text/javascript" src="/resources/js/common/pagination.js"></script>
<script type="text/javascript" src="/resources/js/pedometer/integration.js"></script>
<link rel="stylesheet" type="text/css" href="/resources/pedometer/css/sub.css" />
<script type="text/javascript">
	$(function(){
		
	});	
</script>
</head>

<body>
	<input type="hidden" value="${pagination.totalRecords}" id="totalRecords" />
	<input type="hidden" id="totalPages" value="${pagination.totalPages}" />
	<input type="hidden" id="currPage" value="${pagination.currPage}" />
	<!-- 表单数据提交发送请求 -->
	<form id="searchForm" method="post" action="./integration.htm">
		<input id="toPage" name="pageNo" type="hidden" value="${search.pageNo }" /> 
		<input id="pageSize" name="pageSize" type="hidden" value="10" />
	</form>
	<h1>积分</h1>
	<div class="rightContMain">
	    <div class="searchBar">
            <div>
            	<table cellpadding="0" cellspacing="0" >
                	<tr>
                    	<td>
                    		<button class="cxbtn" onclick="integration.btnEdit('add','')"> 更新积分 </button>
                    	</td>
                    </tr>
                </table>
            </div>
	    </div>
	    
	    <p class="line"></p>
	    
	    <div class="gridWrap">
	        <div class="gridHead"><b>积分查询</b></div>
	        <div class="gridCont">
	            <table class="gridTable" style="width:100%;" cellpadding="0" cellspacing="0">
	                <tr>
	                	<th>姓名</th>
	                	<th>积分</th>
	                </tr>
	                
	                <c:forEach var="searchResult" varStatus="status" items="${pagination.result }">
	                	<tr>
		                	<td>${searchResult.employee_name }</td>
		                	<td>${searchResult.integration_value }</td>
		                	
	                	</tr>
	                </c:forEach>
	                
	            </table>
	        </div>
	        
			<!--start:分页-->
			<div class="bottom-pagination">
				<div class="pagination-box">
					<div class="pagination">
						<ul>
							<li>
								<div class="paginations" name="Pagination"></div> <span>共${pagination.totalRecords}条记录</span>
								<span> 到第 <input type="text" name="toTargetPage"
									style="width: 25px;" value="${pagination.currPage}" /> <span>页</span>
									<input type="button" value="确定" id="J_JumpTo"
									name="toTargetPage_btn" />
							</span>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!--end：分页-->

	    </div>
	</div>
</body>
</html>
