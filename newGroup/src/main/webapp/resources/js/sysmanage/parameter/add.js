addParameter = function(){
	return {
		
		//增加参数
		save : function(){
			$('#param_fm').form('submit',{
				url:"/pc/parameter/add.htm",
				onSubmit: function(){
					return $('#param_fm').form('validate');
				},
				success:function(data){
					if(data=='SUCCESS'){
						Ict.info("保存成功",function(){
							$('#param_fm').form('clear');
							Ict.closeWin();
							$('#parameter_table').datagrid('reload');
						});
					} else {
						Ict.error("保存失败!");
					}
				}
			});
		}
	};
}();
