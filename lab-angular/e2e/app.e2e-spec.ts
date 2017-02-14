import { LabAngularPage } from './app.po';

describe('lab-angular App', function() {
  let page: LabAngularPage;

  beforeEach(() => {
    page = new LabAngularPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
