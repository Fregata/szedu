<form>
  <fieldset>
    <legend>创建科目</legend>

    <div class="row">
      <div class="large-12 columns">
        <label>科目编码</label>
        <input type="text" placeholder="10001">
      </div>
    </div>

    <div class="row">
      <div class="large-4 columns">
        <label>科目届别</label>
        <select id="year" name="year">
          <option value="2015">2015届</option>
          <option value="2014">2014届</option>
          <option value="2013">2013届</option>
          <option value="2012">2012届</option>
          <option value="2011">2011届</option>
          <option value="2010">2010届</option>
          <option value="2009">2009届</option>
          <option value="2008">2008届</option>
          <option value="2007">2007届</option>
          <option value="2006">2006届</option>
          <option value="2005">2005届</option>
        </select>
      </div>
      
      <div class="large-4 columns">
        <label>学校等级</label>
        <select id="level" name="level">
          <option value="PS">小学</option>
          <option value="MS">初中</option>
          <option value="HS">高中</option>
        </select>
      </div>
      
      <div class="large-4 columns">
        <div class="row collapse">
          <label>科目名称</label>
          <select id="subject" name="subject">
            <option value="CN">语文</option>
            <option value="MA">数学</option>
            <option value="EN">英语</option>
            <option value="PH">物理</option>
            <option value="BI">生物</option>
            <option value="CH">化学</option>
            <option value="HI">历史</option>
            <option value="PO">政治</option>
            <option value="GE">地理</option>
          </select>
        </div>
      </div>
    </div>

    <div class="row">
      <div class="large-12 columns">
        <label>科目描述</label>
        <textarea placeholder="CNPS201301-2013届小学一年级语文"></textarea>
      </div>
    </div>
    <div class="row">
      <div class="large-4 columns">&nbsp&nbsp</div>
      <div class="large-4 columns">
        <a href="#" class="button tiny">重置参数</a>
        <a href="#" class="button tiny">提交表单</a>
      </div>
      <div class="large-4 columns">&nbsp&nbsp</div>
    </div>
  </fieldset>
</form>