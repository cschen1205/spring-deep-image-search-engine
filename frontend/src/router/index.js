import Vue from 'vue'
import Router from 'vue-router'
import MachineLearningCatalogue from '@/components/MachineLearningCatalogue'
import ImageUpload from '@/components/ImageUpload'
import ImageSearch from '@/components/ImageSearch'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'MachineLearningCatalogue',
      component: MachineLearningCatalogue
    },
    {
      path: '/image_upload',
      name: 'ImageUpload',
      component: ImageUpload
    },
    {
      path: '/image_search',
      name: 'ImageSearch',
      component: ImageSearch
    }
  ]
})
