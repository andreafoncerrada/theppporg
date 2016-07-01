<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="pphub">
    <title>Upload</title>
  </head>

  <body>
    <div class="col-md-10">
      <div class="row">
      <div class="col-lg-12">
        <g:form name="searchPlicy" url="[action:'index', controller:'search']" id="1">
        <div class="input-group">
          <input type="search" class="form-control" id="search" name="q" placeholder="Search">
        <span  class="input-group-btn">
          <button type="submit" class="btn btn-primary">Submit</button>
        </span>
        </div>
      </g:form>
    </div>
  </div>
      <g:each in="${policyities}" var="policy">
      <g:render template="/policy/card" collection="${policy}" />
      </g:each>
    </div>
  </body>
</html>
