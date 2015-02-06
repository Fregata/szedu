

var sysuser = angular.module('sysuser',['ngRoute','ngResource']);


var currentApp = sysuser;

sysuser.config(function ($routeProvider) {
	
$routeProvider
  .when('/', {
    templateUrl: 'system/sys-users-list.html',
    controller: 'UserListCtrl'
  })
  .when('/user/:id', {
    templateUrl: 'system/sys-users-add.html',
    controller: 'UserAddCtrl'
  })
  .when('/user/:id/view', {
      templateUrl: 'system/sys-users-edit.html',
      controller: 'UserEditCtrl'
    })
  .otherwise({
    redirectTo: '/'
  });

});

currentApp.factory('User',['$resource',function($resource) {
        return $resource('/user/:id',
                        { adminid: '@id'});
  }]);

if(!Array.prototype.remove)
    Array.prototype.remove = function(obj) {
        if(obj == null) return;
        var x = this.indexOf(obj);
        if(x >= 0)
            this.splice(x,1);
    }