/**
 * 地址管理管理初始化
 */
var Address = {
    id: "AddressTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
Address.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: '主键ID', field: 'id', visible: true, align: 'center', valign: 'middle'},
            {title: '用户编号', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '地址标签', field: 'addressTag', visible: true, align: 'center', valign: 'middle'},
            {title: '是否默认地址', field: 'isDefault', visible: true, align: 'center', valign: 'middle'},
            {title: '收货人姓名', field: 'consignee', visible: true, align: 'center', valign: 'middle'},
            {title: '街道地址', field: 'street', visible: true, align: 'center', valign: 'middle'},
            {title: '大楼名称', field: 'buildName', visible: true, align: 'center', valign: 'middle'},
            {title: '门牌号', field: 'unitNo', visible: true, align: 'center', valign: 'middle'},
            {title: '备注', field: 'remark', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
Address.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        Address.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加地址管理
 */
Address.openAddAddress = function () {
    var index = layer.open({
        type: 2,
        title: '添加地址管理',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/address/address_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看地址管理详情
 */
Address.openAddressDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: '地址管理详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/address/address_update/' + Address.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除地址管理
 */
Address.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/address/delete", function (data) {
            Feng.success("删除成功!");
            Address.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("addressId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询地址管理列表
 */
Address.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    Address.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = Address.initColumn();
    var table = new BSTable(Address.id, "/address/list", defaultColunms);
    table.setPaginationType("client");
    Address.table = table.init();
});
